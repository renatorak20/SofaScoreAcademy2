package com.renato.sofascoreacademy2.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.renato.sofascoreacademy2.R
import com.renato.sofascoreacademy2.ui.fragments.create.CreateCompanyFragment
import com.renato.sofascoreacademy2.ui.fragments.show.ShowCompaniesFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(fa: FragmentActivity) :
    FragmentStateAdapter(fa) {

    private val fragmentList = arrayListOf(
        CreateCompanyFragment(),
        ShowCompaniesFragment()
    )

    override fun getItemCount(): Int {
        return TAB_TITLES.size
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return fragmentList[0]
            else -> return fragmentList[1]
        }
    }
}