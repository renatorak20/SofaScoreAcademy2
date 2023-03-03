package com.renato.sofascoreacademy2.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.renato.sofascoreacademy2.entities.Company

class CompanyViewModel : ViewModel() {
    private val _company = MutableLiveData<List<Company>>()
    val company: LiveData<List<Company>> = _company

}