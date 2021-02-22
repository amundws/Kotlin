package academy.learnprogramming.binaryio

import java.io.FileInputStream
import java.io.DataInputStream
import java.io.EOFException

fun main()
{
    val strPath = "src\\testfile.bin"
    val di = DataInputStream(FileInputStream(strPath))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    }
    catch (e: EOFException) {

    }

    //try (fr: FileReader = )
}