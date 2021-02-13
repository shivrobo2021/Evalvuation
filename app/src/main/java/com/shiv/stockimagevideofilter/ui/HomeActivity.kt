package com.shiv.stockimagevideofilter.ui

import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import com.shiv.stockimagevideofilter.databinding.ActivityHomeBinding


class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val tabs = arrayOf("Photos","Videos","Favourites")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        binding.viewpager.adapter =
            HomeTabAdapter(this)
        setContentView(binding.root)
        setUpTabs()
    }

     private fun setUpTabs(){
        TabLayoutMediator(binding.tabLayout, binding.viewpager,
            TabConfigurationStrategy { tab, position ->
                tab.text = tabs[position]
            }).attach()
    }



    override fun onResume() {
        super.onResume()
    }


    override fun onStart() {
        super.onStart()
    }


    override fun onDestroy() {
        super.onDestroy()
    }


    override fun onPause() {
        super.onPause()
    }


    override fun onStop() {
        super.onStop()
    }



}