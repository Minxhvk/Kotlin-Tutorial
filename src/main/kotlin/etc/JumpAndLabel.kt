package etc

/**
 * Jump
 * Label
 */


fun main() {
    val numbers = listOf(1, 2, 3)

    numbers.map { it + 1 }.forEach { println(it)}

    for (number in numbers) {
        println(number)
    }

    // break
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
            println(number)
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }

    // Label이 붙은 곳을 break
    abc@ for (i in 1..100) {
            for (j in 1..100) {
                if (j == 2) {
                    break@abc
                }
                println("${i} ${j}")
            }
        }
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}