package com.bignerdranch.android.weather.domain

import com.bignerdranch.android.weather.ForecastRequest

/**
 * Created by Administrator on 2017/10/6/006.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList>{
    override fun execute(): ForecastList {
        val forecastResult = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastResult.execute())
    }

}