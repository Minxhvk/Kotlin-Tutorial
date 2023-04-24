package class_type


/**
 *  인터페이스
 * */

interface Flyable {
    fun act() {
        println("파닥 파닥")
    }
}

interface Swimable {

    val swimAbility: Int

    fun act() {
        println("어푸 어푸")
    }
}
