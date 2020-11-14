package com.t.viewpager_20201114.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.t.viewpager_20201114.fragments.AddressFragment
import com.t.viewpager_20201114.fragments.NameFragment

class MainViewPagerAdapter(fm:FragmentPagerAdapter):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        if(position==0){
            return NameFragment()
        }
        else if (position==1){

        }
        else {
           return AddressFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }

}