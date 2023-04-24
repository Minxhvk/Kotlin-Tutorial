package class_type

/**
 * Sealed Class, Sealed Interface
 * 외부에서는 상속받지 못하도록 하위 클래스를 봉인
 * !! 컴파일 시 하위 클래스의 타입을 모두 기억 !!
 * 런타임에 클래스 타입 추가 X
 * JDK 17에서도 추가됨
*/

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)

