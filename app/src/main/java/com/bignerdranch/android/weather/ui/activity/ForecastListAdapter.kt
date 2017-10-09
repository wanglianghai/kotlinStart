package com.bignerdranch.android.weather.ui.activity

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bignerdranch.android.weather.R
import com.bignerdranch.android.weather.ctx
import com.bignerdranch.android.weather.domain.Forecast
import com.bignerdranch.android.weather.domain.ForecastList
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_forecast.view.*
import org.jetbrains.anko.find

/**
 * Created by Administrator on 2017/10/4/004.
 */
//class ForecastListAdapter(val items: List<String>)
class ForecastListAdapter(val weekForecast: ForecastList, val itemClick: (Forecast) -> Unit )
    : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent!!.ctx)
                .inflate(R.layout.item_forecast, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindForecast(weekForecast.dailyForecast[position])
    }

//    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)
    class ViewHolder(view: View, val itemClick: (Forecast) -> Unit) : RecyclerView.ViewHolder(view) {
        fun bindForecast(forecast: Forecast) {
            with(forecast) {
                Picasso.with(itemView.ctx).load(iconUrl).into(itemView.icon)
                itemView.date.text = date
                itemView.description.text = description
                itemView.maxTemperature.text = "${high}"
                itemView.minTemperature.text = "${low}"
                itemView.setOnClickListener { itemClick(forecast) }
            }
        }

    }
}