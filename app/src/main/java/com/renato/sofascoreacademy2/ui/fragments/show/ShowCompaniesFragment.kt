package com.renato.sofascoreacademy2.ui.fragments.show

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.renato.sofascoreacademy2.R
import com.renato.sofascoreacademy2.ui.fragments.CompanyViewModel

class ShowCompaniesFragment : Fragment() {

    companion object {
        fun newInstance() = ShowCompaniesFragment()
    }

    private lateinit var viewModel: CompanyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_companies, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(CompanyViewModel::class.java)

    }

}