package basic_use

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("Score Out Of Range")
    }
}

// Java의 if-else -> Statement, Expression : 삼항 연산자.
// Kotlin의 if-else -> Expression -> return if ~ else ~ 형태로 가능. => 삼항 연산자 없음.
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

// Switch

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("-1, 0, 1")
        else -> println("not -1, 0, 1")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("number is 0")
        number % 2 == 0 -> println("number is even")
        else -> println("number is odd")
    }
}