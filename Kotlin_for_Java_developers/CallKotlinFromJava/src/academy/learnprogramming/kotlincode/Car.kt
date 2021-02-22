@file:JvmName("StaticCar")

package academy.learnprogramming.kotlincode

import java.io.IOException

fun topLevel() = println("I'm in the Car file!")

fun main() {
    "Print this".print()
    Car.carComp()
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {

}

//This tells Kotlin compiler to generate code that will inform anything that's using this function that this function throws an IOException
@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

class Car(val color: String, @JvmField val modelName: String, val year: Int,
    var isAutomatic: Boolean) {
    //Custom set
    /*var color: String = color
    private set(value) {
        field = "always green"
    }*/

    companion object {
        const val constant = 25
        @JvmStatic val isAuto = false //@JvmField should work, but doesn't. @JvmStatic works.
        @JvmStatic fun carComp() = println("I'm in Car's companion object!")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

}

fun String.print() {
    println(this)
}
