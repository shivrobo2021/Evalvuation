package com.shiv.stockimagevideofilter.ui

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeTabAdapter(fm: FragmentActivity, private val tabList:List<Int>) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return tabList.size
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return PhotoFragment()
            1 -> return VideoFragment()
            3-> return FavouriteFragment()
        }
       return PhotoFragment()
    }

}