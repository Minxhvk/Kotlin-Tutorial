package basic_use
// Kotlin은 Type 변화를 명시적으로 지정해야 한다.

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val n1 = 3
    val n2 = 5
    val result = n1 / n2.toDouble()


    val n3: Int? = 3
    val n4: Long = n3?.toLong() ?: 0L
}

fun printAgeIfPerson(obj: Any?) {

    val person = obj as? Person // as? -> Safe Call
    println(person?.age)

    if (obj is Person) {
        val person = obj as Person // as Person 생략 가능 -> Smart Cast
        println(person.age)
    }

    if (obj !is Person) {

    }
}

class Person {
    public val age:Int = 0
}


// Any -> Object ( 모든 객체의 최상위 타입 )
// Unit -> Java의 void, 제네릭에서 차이
// Nothing -> 무조건 예외를 반환하는 함수 / 무한 루프 함수