package com.bignerdranch.android.weather.ui.activity

import com.bignerdranch.android.weather.domain.Forecast

/**
 * Created by Administrator on 2017/10/7/007.
 */
interface OnItemClickListener {
    operator fun invoke(forecast: Forecast)
}