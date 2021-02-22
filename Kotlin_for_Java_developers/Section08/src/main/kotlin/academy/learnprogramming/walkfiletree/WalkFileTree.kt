package academy.learnprogramming.walkfiletree

import java.io.File

fun main()
{
    val strPathRoot = "."
    //File(strPathRoot).walkTopDown().forEach { println(it) }
    File(strPathRoot).walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
    
}

