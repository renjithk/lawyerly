package com.app.lawyerly.di.module

import com.app.lawyerly.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * This class represents all Activity related dependencies
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity() : MainActivity
}