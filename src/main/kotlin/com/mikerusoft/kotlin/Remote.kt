package com.mikerusoft.kotlin

interface Remote {
    fun up()
    fun down()

    fun doubleUp() {
        up()
        up()
    }
}