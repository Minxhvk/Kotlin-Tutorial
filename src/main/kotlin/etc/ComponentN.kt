package etc

/**
 * 구조분해
 * componentN
 */

data class Person(
    val name: String,
    val age: Int
)

// Data Class는 아니지만, componentN 함수를 구현하는 방법
class PersonNoDataClass(
    var name: String,
    var age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person("김민혁",  100)

    // 해당 역할이 아래 코드를 실행한 결과이다. -> 구조 분해
    val (name, age) = person

    // componentN
    val name1 = person.component1()
    val age1 = person.component2()

    val person1 = PersonNoDataClass("김민혁", 100)
    val (name2, age2) = person1
}
