package com.renato.sofascoreacademy2

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.renato.sofascoreacademy2.ui.main.SectionsPagerAdapter
import com.renato.sofascoreacademy2.databinding.ActivityMainBinding
import com.renato.sofascoreacademy2.ui.fragments.CompanyViewModel

val tabArray = arrayOf(
    R.string.tab_text_create,
    R.string.tab_text_show,
)

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CompanyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[CompanyViewModel::class.java]

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        
        val tabs: TabLayout = binding.tabs
        TabLayoutMediator(tabs, viewPager){
            tab, position -> when(position){
                0 -> tab.text = getString(tabArray[0])
                else -> tab.text = getString(tabArray[1])
        }
        }.attach()


    }
}