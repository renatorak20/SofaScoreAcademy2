package com.renato.sofascoreacademy2.ui.fragments.create

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.renato.sofascoreacademy2.R

class CreateCompanyFragment : Fragment() {

    private lateinit var viewModel: CreateCompanyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_company, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateCompanyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}