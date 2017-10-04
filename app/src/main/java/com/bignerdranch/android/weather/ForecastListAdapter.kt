package com.bignerdranch.android.weather

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 2017/10/4/004.
 */
class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder =
            ViewHolder(TextView(parent!!.context))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textView.text = items[position]
    }

    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)
}