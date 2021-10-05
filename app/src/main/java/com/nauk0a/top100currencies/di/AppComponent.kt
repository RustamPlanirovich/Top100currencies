package com.nauk0a.top100currencies.di

import com.nauk0a.top100currencies.activites.ChartActivity
import com.nauk0a.top100currencies.activites.MainActivity
import com.nauk0a.top100currencies.chart.LatestChart
import com.nauk0a.top100currencies.fragments.CurrenciesListFragment
import com.nauk0a.top100currencies.mvp.presenter.CurrenciesPresenter
import com.nauk0a.top100currencies.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RestModule::class, MvpModule::class, ChartModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(activity: ChartActivity)

    fun inject(fragment: CurrenciesListFragment)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)

    fun inject(chart: LatestChart)

}