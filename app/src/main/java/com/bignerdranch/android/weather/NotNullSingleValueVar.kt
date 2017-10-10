package com.bignerdranch.android.weather

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Administrator on 2017/10/9/009.
 */
object DelegateExt {
    fun <T> notNullSingleValue() : ReadWriteProperty<Any?, T> = NotNullSingleValueVar()
}
class NotNullSingleValueVar<T>() : ReadWriteProperty<Any?, T> {
    private var value: T? = null
    override fun getValue(thisRef: Any?, property: KProperty<*>): T =
            value ?: throw IllegalStateException(property.name + "not initialized")

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = if (this.value == null) value
        else throw IllegalStateException("${property.name} already initialized")
    }

}