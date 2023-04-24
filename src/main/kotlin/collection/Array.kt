package collection

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println(array[i])
    }

    array.plus(300)

    for ((idx, value) in array.withIndex())
        println("$idx, $value")

    for (i in array) {
        println(i)
    }
}