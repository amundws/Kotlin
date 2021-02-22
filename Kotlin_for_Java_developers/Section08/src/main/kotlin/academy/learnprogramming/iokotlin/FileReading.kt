package academy.learnprogramming.iokotlin

import java.io.File

fun main(args: Array<String>)
{
    val strPath = "C:\\dev\\git\\Kotlin\\Kotlin_for_Java_developers\\Section08\\src\\testfile.txt"
    val strPath2 = "src\\testFile.txt"
    //val lines = File("testfile.txt").reader().readLines()
    /*#1: val lines = File(strPath).reader().readLines()
    lines.forEach { println(it) }*/
    /*#2: val reader = File(strPath).reader()
    val lines = reader.readLines()
    println(lines)*/
    /*#3: val lines = File(strPath).bufferedReader().use { it.readText() }
    println(lines)*/
    /*#4: val lines = File(strPath).readText()
    println(lines)*/
    //#5:
    File (strPath2).reader().forEachLine { println(it) }
    //#6: File (strPath).reader().useLines { it.forEach { println(it) } }
    
}



