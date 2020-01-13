package com.app.lawyerly.ui.screens


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.lawyerly.databinding.LayoutLawyerListBinding
import com.app.lawyerly.factory.ViewModelFactory
import com.app.lawyerly.ui.activity.LawyerDetails
import com.app.lawyerly.ui.adapter.LawyerListAdapter
import com.app.lawyerly.ui.viewmodel.LawyerListViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

/**
 * This class is responsible for displaying a list of lawyers
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class FLawyerList : Fragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var binding: LayoutLawyerListBinding
    private val viewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(LawyerListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LayoutLawyerListBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //loads lawyers
        viewModel.loadLawyers()

        //set adapter for RecyclerView
        binding.listLawyers.adapter = LawyerListAdapter(viewModel)

        //setup listener to handle click events
        viewModel.canShowDetails.observe(viewLifecycleOwner, Observer { event ->
            event?.getContentIfNotHandled()?.let {
                val intent = Intent(activity, LawyerDetails::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
