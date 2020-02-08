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

    // defines inner singleton which is are accessible statically
    val machineOperator: MachineOperator = MachineOperator("Mater")
    machineOperator.checkin()
    println(MachineOperator.minimumBreak()) // defines "like" static method (it's not real Java static under hood)
    println(MachineOperator.checkedIn)

    val machineOperator1: MachineOperator = MachineOperator("Mater1")
    machineOperator1.checkin()
    println(MachineOperator.checkedIn)

    val tv = TV()
    val remote = tv.remote

    println("$tv") //Volume: 0
    remote.up()
    println("After increasing: $tv") //After increasing: Volume: 1
    remote.doubleUp()
    println("After doubleUp: $tv") //After doubleUp: Volume: 3

    val doe = Manager()
    doe.work()

    var doe1 = Manager1(JavaProgrammer())
    doe1.work()
    doe1.takeVacation()

    doe1 = Manager1(CSharpProgrammer())
    doe1.work()
    doe1.takeVacation()

    val doe2 = Manager2()
    doe2.work()

    val doe3 = Manager3(CSharpProgrammer())
    val roe3 = Manager3(JavaProgrammer())

    doe3.work() //...write C#...
    doe3.meeting()//organizing meeting with CSharpProgrammer

    roe3.work() //...write Java...
    roe3.meeting()//organizing meeting with JavaProgrammer

    val doe4 = Manager4(CSharpProgrammer(), DepartmentAssistant())
    doe4.work()          //...write C#...
    doe4.takeVacation()  //of course
    doe4.doChores()      //routine stuff
    doe4.fileTimeSheet() //manually forwarding this...No escape from that

    var comment: String by PoliteString("Something to do")
    println(comment)

    comment = "This is stupid"
    println(comment)

    println("comment is of length: ${comment.length}")



    var comment1: String by beingpolite("Stupid form")
    println(comment1)

    comment1 = "A long crazy day"
    println(comment1)

    val car = Car(2019, "pink")
}

fun beingpolite(content: String) = PoliteString(content)