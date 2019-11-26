package com.mikerusoft.kotlin

class Manager1(val worker: Worker) {
    fun work() = worker.work()

    fun takeVacation() = worker.work()
}