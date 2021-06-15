package id.co.hilt.ui.viewmodel

import android.os.Build
import android.support.v4.media.MediaBrowserCompat
import android.support.v4.media.MediaMetadataCompat.METADATA_KEY_MEDIA_ID
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.co.hilt.data.entities.Song
import id.co.hilt.exoplayer.MusicServiceConnection
import id.co.hilt.exoplayer.isPlayEnabled
import id.co.hilt.exoplayer.isPlaying
import id.co.hilt.exoplayer.isPrepared
import id.co.hilt.util.Constant.MEDIA_ROOT_ID
import id.co.hilt.util.Resource

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class MainViewModel @ViewModelInject constructor(
    private val musicServiceConnection: MusicServiceConnection
): ViewModel() {
    private val _mediaItems = MutableLiveData<Resource<List<Song>>>()
    val mediaItems : LiveData<Resource<List<Song>>> = _mediaItems

    val isConnected = musicServiceConnection.isConnected
    val networkError = musicServiceConnection.networkError
    val curPlayingSong = musicServiceConnection.curPlayingSong
    val playbackState = musicServiceConnection.playbackState

    init {
        _mediaItems.postValue(Resource.loading(null))
        musicServiceConnection.subscribe(MEDIA_ROOT_ID, object : MediaBrowserCompat.SubscriptionCallback(){
            override fun onChildrenLoaded(
                parentId: String,
                children: MutableList<MediaBrowserCompat.MediaItem>
            ) {
                super.onChildrenLoaded(parentId, children)
                val items = children.map {
                    Song(
                        it.mediaId!!,
                        it.description.title.toString(),
                        it.description.subtitle.toString(),
                        it.description.mediaUri.toString(),
                        it.description.iconUri.toString()
                    )
                }
                Log.d("Ampas", "onChildrenLoaded: ${items.size}")
                _mediaItems.postValue(Resource.success(items))
            }
        })
    }

    fun skipToNextSong(){
        musicServiceConnection.transportControls.skipToNext()
    }

    fun skipToPrevoiusSong(){
        musicServiceConnection.transportControls.skipToPrevious()
    }

    fun seekTo(pos: Long){
        musicServiceConnection.transportControls.seekTo(pos)
    }

    fun playOrToggleSong(mediaItem: Song, toggle: Boolean = false){
        val isPrepared = playbackState.value?.isPrepared ?: false
        if(isPrepared && mediaItem.mediaId == curPlayingSong?.value?.getString(METADATA_KEY_MEDIA_ID)){
            playbackState.value?.let {
                playbackState ->
                when{
                    playbackState.isPlaying -> if(toggle) musicServiceConnection.transportControls.pause()
                    playbackState.isPlayEnabled -> musicServiceConnection.transportControls.play()
                    else -> Unit
                }
            }
        }else{
            musicServiceConnection.transportControls.playFromMediaId(mediaItem.mediaId,  null)
        }
    }

    override fun onCleared() {
        super.onCleared()
        musicServiceConnection.unsubscribe(MEDIA_ROOT_ID, object : MediaBrowserCompat.SubscriptionCallback(){

        })
    }
}