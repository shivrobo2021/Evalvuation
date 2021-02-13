package com.shiv.stockimagevideofilter.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.shiv.stockimagevideofilter.GlideApp
import com.shiv.stockimagevideofilter.R
import com.shiv.stockimagevideofilter.listener.RecyclerViewClickListener
import com.shiv.stockimagevideofilter.data.dto.Photos
import com.shiv.stockimagevideofilter.databinding.PhotoItemBinding

class MediaAdapter(private val mediaList: List<Photos>, private val mActivity: FragmentActivity?,private  val listener: RecyclerViewClickListener) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding =
            PhotoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(
            itemBinding,
            listener
        )
    }

    override fun getItemCount(): Int {
        return mediaList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photo: Photos = mediaList[position]
        if (mActivity != null) {
            holder.bindItems(photo,mActivity)
        }
    }


    class ViewHolder(private val itemBinding: PhotoItemBinding, private val listener: RecyclerViewClickListener) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bindItems(photo: Photos,mActivity: FragmentActivity) {
            GlideApp.with(mActivity)
                .load(photo.src.small)
                .centerCrop()
                .into(itemBinding.background);
            itemBinding.favourite.setOnClickListener {
                itemBinding.favourite.setImageResource(R.drawable.ic_details_favorite_slect)
                listener.onItemClick(photo)
            }
        }
    }
}