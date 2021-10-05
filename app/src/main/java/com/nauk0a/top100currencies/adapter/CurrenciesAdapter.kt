package com.nauk0a.top100currencies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nauk0a.top100currencies.R
import java.util.*

class CurrenciesAdapter : BaseAdapter<CurrenciesAdapter.CurrencyViewHolder>() {

    //создает ViewHolder и инициализирует views для списка
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CurrencyViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return CurrencyViewHolder(v)
    }

    //реализация вьюхолдера
    class CurrencyViewHolder(view: View): BaseAdapter.BaseViewHolder(view){

        val ivCurrencyIcon = view.findViewById<ImageView>(R.id.ivCurrencyIcon)
        val tvCurrencySym = view.findViewById<TextView>(R.id.tvCurrencySym)
        val tvCurrencyName = view.findViewById<TextView>(R.id.tvCurrencyName)
        val tvCurrencyMarketCap = view.findViewById<TextView>(R.id.tvCurrencyMarketCap)
        val tvCurrencyPrice = view.findViewById<TextView>(R.id.tvCurrencyPrice)
        init {
            //слушатель клика по элементам списка
            itemView.setOnClickListener {

            }
        }

        //привязываем элементы представления списка к RecyclerView и заполняем данными
        override fun bind(item: Any) {
            let {
                item as Currency
                Glide.with(view.context).load(item.image).into(ivCurrencyIcon)
                tvCurrencySym.text = item.symbol
                tvCurrencyName.text = item.name
                tvCurrencyMarketCap.text = item.marketCap
                tvCurrencyPrice.text = item.price.toString()
            }
        }
    }

    //класс данных для элемента списка
    data class Currency(
        val id: String,
        val symbol: String,
        val name: String,
        val image: String,
        val price: Float,
        val marketCap: String,
        val marketCapRank: Int,
        val totlaVolume: Float,
        val priceChangePercentage24: Float,
        val marketCapChangePercentage24h: Float,
        val circulatingSupply: Double,
        val totalSupply: Long,
        val ath: Float,
        val athChangePercentage: Float
    )
}