package basic_use

import java.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 객체 비교 연산자 -> compareTo 호출
    if (money1 > money2) {
        println("money1 > money2")
    }

    // Kotlin 동일성 : ===
    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4) // 주소까지 확인.
    println(money3 == money5) // equals
}