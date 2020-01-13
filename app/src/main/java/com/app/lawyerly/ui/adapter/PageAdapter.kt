package com.app.lawyerly.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.lawyerly.ui.screens.FDummyList
import com.app.lawyerly.ui.screens.FLawyerList

/**
 * This class is responsible for creating screens for ViewPager2
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class PageAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItem(position: Int): Fragment {
        return if(0 == position) FLawyerList()
        else FDummyList()
    }

    override fun getItemCount(): Int = MAX_NUM_TABS

    companion object {
        const val MAX_NUM_TABS = 3
    }
}