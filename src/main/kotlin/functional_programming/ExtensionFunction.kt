package functional_programming

/**
 * 확장 함수
 * 원래 Class에 선언되어 있는 Method 처럼 이용할 수 있다.
 * 캡슐화 문제 : 확장 함수는 클래스에 있는 private, protected 멤버는 접근할 수 없다.
 * 확장 함수 vs 기존 함수 -> 멤버함수가 우선적으로 호출된다.
 * 상속의 확장 -> 선언된 타입의 확장 함수가 호출
 */

fun String.lastChar(): Char {
    return this[this.length - 1]
}

val String.lastChar: Char
    get() = this[this.length - 1]

fun main() {
    val str = "ABC"
    println(str.lastChar())
}