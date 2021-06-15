package id.co.hilt.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import id.co.hilt.data.entities.Song
import id.co.hilt.util.Constant.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song>{
        return try{
            songCollection.get().await().toObjects(Song::class.java)
        }catch (e: Exception){
            emptyList()
        }
    }

}