package com.renato.sofascoreacademy2.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.renato.sofascoreacademy2.ui.fragments.CreateCompanyFragment
import com.renato.sofascoreacademy2.ui.fragments.ShowCompaniesFragment

private const val NUM_TABS = 2

class SectionsPagerAdapter(fa: FragmentActivity) :
    FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CreateCompanyFragment()
            else -> ShowCompaniesFragment()
        }
    }
}
