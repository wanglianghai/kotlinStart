package com.bignerdranch.android.weather

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created by Administrator on 2017/10/9/009.
 */
class App : Application() {
    companion object {
        var instance: App by DelegateExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}