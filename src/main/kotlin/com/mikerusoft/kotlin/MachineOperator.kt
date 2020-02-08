package com.mikerusoft.kotlin

class MachineOperator(val name: String) {

    fun checkin() = checkedIn++
    fun checkout() = checkedIn--

    companion object MachineOperatorFactory {
        var checkedIn = 0
            private set
        fun minimumBreak() = "$checkedIn -> 15 minutes every 2 hours"
    }
}