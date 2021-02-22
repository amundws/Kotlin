package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car

fun main()
{
    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    //car.color = null //IllegalArgumentException with @NotNull jetbrains annotation
    println(car)

    /*car.color = null
    println(car)*/

    var model = car.model
    //println(model.javaClass)
    model = null
    println(model)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings) //can't pass array to varargs method. Must use spread * operator
    //car.wantsIntArray(arrayOf(1, 2, 3)) //Type mismatch. Required: IntArray! Found: Array<Int>
    car.wantsIntArray(arrayOf(1, 2, 3).toIntArray())
    car.wantsIntArray(intArrayOf(1, 2, 3))

    //(car.anObject as java.lang.Object).notify()
    //car.anObject.javaClass

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod( { println("I'm in a thread! (from Kotlin)")} )

}


