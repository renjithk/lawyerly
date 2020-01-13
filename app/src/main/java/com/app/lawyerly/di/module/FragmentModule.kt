package com.app.lawyerly.di.module

import com.app.lawyerly.ui.screens.FLawyerList
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This class represents all Fragment related dependencies
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeLawyerListFragment() : FLawyerList
}