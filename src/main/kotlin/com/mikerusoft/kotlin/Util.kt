package com.mikerusoft.kotlin

object Util {
    @JvmStatic
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}