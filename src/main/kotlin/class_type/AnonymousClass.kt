package class_type

/**
 * 익명 클래스
 */

fun fn_1() {
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

interface Movable {

    fun move()

    fun fly()
}