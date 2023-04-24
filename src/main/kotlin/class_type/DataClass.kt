package class_type

/**
 * Data Class
 * DTO
 * equals, hashCode, toString을 자동으로 만들어준다.
 * JDK16 이상 -> record class
 */

//
data class PersonDto(
    val name: String,
    val age: Int,
)

fun main() {
    val dto1 = PersonDto("김민혁", 100)
    val dto2 = PersonDto("김민혁", 100)
    println(dto1 == dto2)
    println(dto1)
}
