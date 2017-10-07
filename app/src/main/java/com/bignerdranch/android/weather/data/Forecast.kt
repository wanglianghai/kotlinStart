package com.bignerdranch.android.weather.data

import java.util.*

/**
 * Created by Administrator on 2017/10/5/005.
 */
data class Forecast(val dt: Long, val temp: Temperature, val pressure: Float,
                    val humidity: Int, val weather: List<Weather>,
                    val speed: Float, val deg: Int, val clouds: Int, val rain: Float)
