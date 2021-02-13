package com.shiv.stockimagevideofilter.ui

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.shiv.stockimagevideofilter.listener.RecyclerViewClickListener
import com.shiv.stockimagevideofilter.data.dto.Photos
import com.shiv.stockimagevideofilter.databinding.FragmentPhotoBinding

class PhotoFragment : Fragment(),
    RecyclerViewClickListener {

    private lateinit var binding: FragmentPhotoBinding
    private  var photoViewModel =
        PhotoViewModel()
    private lateinit var adapter: MediaAdapter

            override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
    }

    private fun initViewModel(){
        photoViewModel.photos.observe(this, Observer<List<Photos>>{ photoData ->
            if(photoData!=null) {
                adapter = MediaAdapter(
                    photoData,
                    activity,
                    this
                )
                binding.recyclerView.layoutManager = LinearLayoutManager(activity)
                binding.recyclerView.adapter = adapter
            }
        })
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhotoBinding.inflate(inflater, container, false);
        return binding.root;
    }

    override fun onItemClick(photo: Photos) {
        photoViewModel.updateFavourite(photo)
    }


}