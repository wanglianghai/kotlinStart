package com.bignerdranch.android.weather

import android.util.Log
import java.net.URL

/**
 * Created by Administrator on 2017/10/5/005.
 */
class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}