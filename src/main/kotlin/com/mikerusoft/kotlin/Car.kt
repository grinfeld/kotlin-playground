package com.mikerusoft.kotlin

import java.lang.RuntimeException

class Car (val yearOfMake: Int, theColor : String) {
    var fuelLevel = 100
        private set

    var color = theColor
        set (value) {
            if (value.isBlank()) {
                throw RuntimeException("blank")
            }
            field = value
        }

    init {
        if (yearOfMake < 2020) { fuelLevel = 98 }
    }
}