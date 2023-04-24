package class_type

/**
 * constructor ( primary constructor, sub )
 * field
 * init
 * getter, setter
 */

// constructor 키워드 생략 가능, 주생성자 (primary constructor, 반드시 존재해야 함.)
class Person1 constructor(
    name: String,
    var age: Int
)
{
    // val 자체는 프로퍼티 -> getter와 setter가 자동으로 생성됨
    // field를 사용하는 이유 : name.으로 부르면 name의 getter를 부른다. -> 무한 호출
    // backing field. -> 사용하는 경우는 드물다
    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }


    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 부생성자 (secondary constructor, 최종적으로 this를 호출해야 한다.)
    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    // 부생성자를 생성하기 보다는 주생성자에 default parameter를 넣는 방식을 지향한다.
    // 거의 안씀. 그러나, Converting은 정적 팩토리 메서드를 활용하기.
    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // Custom Getter
    val isAdult1: Boolean
        get() = this.age >= 20

    // Custom Getter
    val isAdult_V2: Boolean
        get() {
            return this.age >= 20
        }


}


fun main() {
    val person = Person1("김민혁", 100)
    val person2 = Person1("김민혁")
    val person3 = Person1()

    println(person.name)
    person.age = 10
    println(person.age)

}