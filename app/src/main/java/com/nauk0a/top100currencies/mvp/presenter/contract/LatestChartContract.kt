package com.nauk0a.top100currencies.mvp.presenter.contract

class LatestChartContract {
    interface View : BaseContract.View {
        fun addEntryToChart(value: Float, date: String = "")
        fun addEntryToChart(date: Float, value: Float)
        fun showProgress()
        fun hideProgress()
        fun showErrorMessage(error: String?)
        fun refresh()
    }

    abstract class Presenter: BaseContract.Presenter<View>() {
        abstract fun makeChart(id: String)
        abstract fun refreshChart()
    }
}