package basic_use

/** 하나의 Expression은 = 로 선언할 수 있다. */
fun max(a: Int, b: Int) = if (a > b) a else b

// Default Paramter -> Java에서는 Overrloading로 해결 -> 메서드가 늘어남.
fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else{
            print(str)
        }
    }
}

fun main() {
    repeat("Hello World", 3, false)
    repeat("Hello World", userNewLine = false) // Named Argument


    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array) // Spread
}


fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}





