package basic_use

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Given ${str} is not a number")
    }
}

/** try catch 또한 expression */
fun parseIntOrThrow_V2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}


/**
Checked Unchecked
*/

/** Kotlin은 모두 Unchecked Exception이다. */
class FilePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }


    /**  try with resources -> use */
    fun readFilePath(path: String) {
        BufferedReader(FileReader(path)).use {reader ->
            println(reader.readLine())
        }
    }
}