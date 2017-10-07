package com.bignerdranch.android.weather.domain

/**
 * Created by Administrator on 2017/10/6/006.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)
