package com.nauk0a.top100currencies.di

import com.nauk0a.top100currencies.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = arrayOf(
        AppModule::class,
        RestModule::class,
        MvpModule::class,
        ChartModule::class
    )
)
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}