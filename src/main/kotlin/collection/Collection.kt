package collection

/**
 * List / MutableList
 * Set / MutableSet
 * Map / MutableMap
 * unmodifiable
 *
 * List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 null이 아님
 * List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
 * List<Int?>? : 리스트에 null이 들어갈 수 있고, 리스트도 null일 수 있음
 */

fun main() {
    // List
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    val mutableList = mutableListOf(100, 200)

    printNumbers(emptyList()) // 타입 추론 가능

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }



}

private fun printNumbers(numbers: List<Int>) {

}
