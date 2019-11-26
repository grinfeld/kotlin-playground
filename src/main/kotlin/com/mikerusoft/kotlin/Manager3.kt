package com.mikerusoft.kotlin

class Manager3(val staff : Worker) : Worker by staff {
    fun meeting() = println("organizing meeting with ${staff.javaClass.simpleName}")
}