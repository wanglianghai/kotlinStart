package com.bignerdranch.android.weather.domain

import com.bignerdranch.android.weather.data.Forecast
import com.bignerdranch.android.weather.data.ForecastResult
import java.text.DateFormat
import java.util.*
import com.bignerdranch.android.weather.domain.Forecast as ModelForecast

/**
 * Created by Administrator on 2017/10/6/006.
 */
//解析一部分一个方法
class ForecastDataMapper {
    fun convertFromDataModel(forecast: ForecastResult): ForecastList{
        return ForecastList(forecast.city.name, forecast.city.country
                , convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast{
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt(), generateIconUrl(forecast.weather[0].icon))
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }

    private fun generateIconUrl(iconUrl: String): String
            = "http://openweathermap.org/img/w/$iconUrl.png"
}