package com.app.lawyerly

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.app.lawyerly.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Base class for maintaining all application state
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
class LawyerlyApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {
    @Inject lateinit var dispatchingInjector: DispatchingAndroidInjector<Activity>
    @Inject lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()
        //initialise Dagger
        DaggerApplicationComponent.builder().application(this).build().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingInjector

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector
}