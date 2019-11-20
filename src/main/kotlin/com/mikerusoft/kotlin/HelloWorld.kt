package com.mikerusoft.kotlin

import com.mikerusoft.kotlin.Temperature.c2f
import java.lang.StringBuilder
import kotlin.math.roundToLong

fun main() {
    println("Hello World")
    val greet = "hello"
    println(greet::class)
    println(greet::class.java)

    var factor = 2

    fun doubleIt(n : Int) = n * factor
    println(doubleIt(2))
    factor = 0
    println(doubleIt(2))

    val message = StringBuilder("hello ");
    message.append("There")
    println(message)

    println("hi" == "hi")
    println("hi" == "Hi")
    println(null == "hi")
    println("hi" == null)
    println(null == null)


    val price = 12.25
    val taxRate = 0.08

    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)

    fun nickName(name: String): String? {
        if (name == "William") {
            return "Bill"
        }
        return null;
    }

    var nickname:String? = nickName("Mike")
    println(nickname?.toUpperCase())
    nickname = nickName("William")
    println(nickname?.toUpperCase())

    println(Util.numberOfProcessors())

    println(unitsSupported())
    println("" + Temperature.f2c(75.23).roundToLong() + " C")
    println("" + c2f(24.305).roundToLong() + " F")
}

