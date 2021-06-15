package id.co.hilt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import id.co.hilt.R
import id.co.hilt.data.entities.Song
import kotlinx.android.synthetic.main.list_item.view.*
import javax.inject.Inject

class SwipeSongAdapter : BaseAdapter(R.layout.swipe_item) {
    override val differ = AsyncListDiffer(this, diffCallback)


    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.itemView.apply {
            val text = "${song.title} - ${song.subtitle}"
            tvPrimary.text = text

            setOnClickListener{
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }


}