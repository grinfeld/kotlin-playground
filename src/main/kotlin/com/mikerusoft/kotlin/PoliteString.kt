package com.mikerusoft.kotlin

import kotlin.reflect.KProperty

class PoliteString(var content: String)  {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : String {
        return content.replace(Regex("stupid|fuck|crazy", RegexOption.IGNORE_CASE), {m -> replace(m.value)})
    }

    /*operator fun getValue(thisRef: Any?, property: KProperty<*>) = content.orEmpty().replace("stupid", "s*****")*/

    operator fun setValue(nothing: Nothing?, property: KProperty<*>, value: String) {
        content = value
    }

    fun replace(str : String) : String {
        if (str.length <= 1)
            return str

        return str[0] + str.toCharArray().toList().takeLast(str.length - 1).map{s -> '*'}.joinToString(separator = "")
    }
}