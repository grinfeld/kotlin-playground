package com.mikerusoft.kotlin

class Manager4(val staff: Worker, val assistant: Assistant) : Worker by staff, Assistant by assistant {

    override fun takeVacation() = println("of course")

    override fun fileTimeSheet() {
        print("manually forwarding this...")
        assistant.fileTimeSheet()
    }
}