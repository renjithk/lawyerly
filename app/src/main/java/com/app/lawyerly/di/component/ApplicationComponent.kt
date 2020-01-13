package com.app.lawyerly.di.component

import android.app.Application
import com.app.lawyerly.LawyerlyApplication
import com.app.lawyerly.di.module.ActivityModule
import com.app.lawyerly.di.module.FragmentModule
import com.app.lawyerly.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Defines bindings on a top-level
 *
 * Created by Renjith Kandanatt on 11/01/2020
 */
@Singleton
@Component(
    modules = [
        FragmentModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application) : Builder

        fun build() : ApplicationComponent
    }

    fun inject(controller: LawyerlyApplication)
}