package com.bignerdranch.android.weather.domain

/**
 * Created by Administrator on 2017/10/6/006.
 */
interface Command<T> {
    fun execute(): T
}