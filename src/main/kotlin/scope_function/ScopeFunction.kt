package scope_function

import etc.PersonNoDataClass

/**
 * scope function : 일시적으로 영역을 확장하는 함수
 */


fun printPerson(person: PersonNoDataClass?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

// let, run -> lambda의 결과를 반환
fun printPersonV2(person: PersonNoDataClass?) {

    person?.let {
        println(it.name)
        println(it.age)
    }

    // also, apply -> 객체가 반환
    person?.also {
        it.age = 100
    }

}

fun aboutLet() {

    // let -> 하나 이상의 함수를 call chain 결과로 호출 할 때
    // non-null일 경우에 코드 블록을 실행할 경우
    // 일회성으로 제한된 영역에 지역 변수를 만들 때
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)
}

// DB에 저장하고 인스턴스를 계속 사용해야 할 경우
fun aboutrun() {
    val person = PersonNoDataClass("김민혁", 100).run(personRepository::save)
}

