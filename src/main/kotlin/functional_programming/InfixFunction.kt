package functional_programming

/**
 * 중위 함수
 * 변수.함수이름(arg) -> 변수 함수 arg
 */


fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    val num1 = 1
    val num2 = 2

    println(num1.add(3))
    println(num2 add2 3)
}