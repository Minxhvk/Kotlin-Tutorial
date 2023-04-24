package class_type

/**
 * Static
 */
class Person2(
    var name:String,
    var age:Int
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1 // const -> 컴파일 시 변수에 할당

        @JvmStatic // Person2.newBaby() 가능
        // 없다면 Person2.Companyon.newBaby()
        // Factory 이름 -> Person2.Factory.newBaby()
        fun newBaby(name: String): Person2 {
            return Person2(name, MIN_AGE)
        }

        override fun log() {
            println("Person3 클래스의 동행객체 Factory")
        }
    }

}

interface Log {
    fun log()
}