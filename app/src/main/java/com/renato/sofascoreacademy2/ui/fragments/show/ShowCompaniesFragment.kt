package com.renato.sofascoreacademy2.ui.fragments.show

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.renato.sofascoreacademy2.R
import com.renato.sofascoreacademy2.ui.fragments.CompanyViewModel

class ShowCompaniesFragment : Fragment() {

    private lateinit var viewModel: CompanyViewModel
    private lateinit var companiesInflater: LayoutInflater

    private lateinit var linearLayout:LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(requireActivity())[CompanyViewModel::class.java]
        companiesInflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.fragment_show_companies, container, false)

        linearLayout = view.findViewById(R.id.linear_layout)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getList().observe(viewLifecycleOwner) { list ->
            run {
                linearLayout.removeAllViews()
                list.forEach { item ->
                    var string = item.name + ", " + item.address + ", " + item.city + ", " + item.country + ", " + item.phone + ", " + item.email + ", " + item.website + ", " + item.industry + ", " + item.description + ", " + item.foundedYear
                    val textView = TextView(requireContext())
                    textView.text = string
                    linearLayout.addView(textView)
                }
            }
        }
    }
}