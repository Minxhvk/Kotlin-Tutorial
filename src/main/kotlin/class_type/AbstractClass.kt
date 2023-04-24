package class_type

/**
 *  추상 클래스
 * */

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // getter를 override하기 위해 open
) {

    abstract fun move()

}

// 상속할 때 부모의 생성자를 바로 호출해야 한다.
class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이")
    }
}

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}