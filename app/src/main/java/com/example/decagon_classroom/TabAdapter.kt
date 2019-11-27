package com.example.decagon_classroom

import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class TabAdapter(var tabCount: Int, fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        val fragment = when(position){
            0-> ArticleFragment()
            1 -> BooksFragment()
            2 -> VideosFragment()
            else -> null
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return  tabCount
    }


}