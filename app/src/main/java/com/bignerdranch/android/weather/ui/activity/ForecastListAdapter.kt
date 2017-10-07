package com.bignerdranch.android.weather.ui.activity

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.bignerdranch.android.weather.domain.ForecastList

/**
 * Created by Administrator on 2017/10/4/004.
 */
//class ForecastListAdapter(val items: List<String>)
class ForecastListAdapter(val weekForecast: ForecastList): RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder
            = ViewHolder(TextView(parent!!.context))

    override fun getItemCount(): Int = weekForecast.dailyForecast.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder!!.textView.text = "$date - $description - $high/$low"
        }
    }

    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)
}