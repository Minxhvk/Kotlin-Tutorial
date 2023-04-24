package basic_use

fun startsWithA1_1(str: String?): Boolean {
    if (str == null){
        throw  IllegalArgumentException("null")
    }
    return str.startsWith("A")
}

fun startsWithA2_1(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3_1(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

// Safe Call
fun main() {

    val str: String? = "ABC"
//    str.length  : 불가능 -> nullable
    str?.length // 가능 -> null일 경우 null을 반환, str일 경우 length  실행

    // Elvis 연산자
    str?.length ?:0 // null일 경우 0을 반환

}

fun startsWithA1_2(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA2_2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA2_3(str: String?): Boolean? {
    return str?.startsWith("A") ?: false
}

// Null이 아님을 명시 '!!'
fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}
