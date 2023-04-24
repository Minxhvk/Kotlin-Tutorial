package basic_use

/**
 *  Singleton
 */
object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a += 10
}