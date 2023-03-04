package com.renato.sofascoreacademy2.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.renato.sofascoreacademy2.entities.Company

class CompanyViewModel : ViewModel() {
    private val _companies = MutableLiveData<MutableList<Company>>()
    val companies : LiveData<MutableList<Company>>
        get() = _companies


    fun addCompany(company: Company) {
        val list = _companies.value?.toMutableList() ?: mutableListOf()
        list.add(company)
        _companies.value = list
    }

    fun getList(): MutableLiveData<MutableList<Company>> {
        return _companies
    }
}