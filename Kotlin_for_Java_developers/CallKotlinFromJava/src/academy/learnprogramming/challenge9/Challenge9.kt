package academy.learnprogramming.challenge9

import academy.learnprogramming.javacode.Employee

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones" //Need both set and get method for this.
    employee.salaryLast3Years = floatArrayOf(50_000.25f, 54_000.60f, 56_800.42f) //Must use floatArrayOf() to get primitive array


}


