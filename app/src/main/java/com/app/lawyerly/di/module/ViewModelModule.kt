package com.app.lawyerly.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.lawyerly.di.key.ViewModelKey
import com.app.lawyerly.factory.ViewModelFactory
import com.app.lawyerly.ui.viewmodel.LawyerListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * This class represents all ViewModel dependencies
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
@Module
internal abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LawyerListViewModel::class)
    protected abstract fun lawyerViewModel(viewModel: LawyerListViewModel) : ViewModel
}