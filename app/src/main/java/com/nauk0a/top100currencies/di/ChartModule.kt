package com.nauk0a.top100currencies.di

import com.nauk0a.top100currencies.chart.LatestChart
import com.nauk0a.top100currencies.formatters.YearValueFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChartModule {

    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()



    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()
}