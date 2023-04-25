package functional_programming

/**
 * 코틀린에서 컬렉션 함수를 다루는 방법
 */


data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
) {
    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1, 1)
    )

    val appelsFilter = fruits.filter { fruit -> fruit.name == "사과" }
    val applesIndexedFilter = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    val appelsMap = fruits.filter { it.name == "사과" }.map { it.currentPrice }
    val appelsIndexedMap = fruits.filter { it.name == "사과" }
        .mapIndexed { idx, fruit ->

            println(idx)
            fruit.currentPrice
        }

//    val appelsmapNotNull = fruits.filter { it.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrValue() }

    // all, none, any
    val isAllApple = fruits.all {it.name == "사과"}
    val isNoApple = fruits.none {it.name == "사과"}
    val isAnyApple = fruits.any {it.name == "사과"}

    val fruitCount = fruits.count()
    val fruitOrderingAsc = fruits.sortedBy { it.currentPrice }
    val fruitOrderingDesc = fruits.sortedByDescending { it.currentPrice }
    val distinctFruitNames = fruits.distinctBy { it.name }
        .map { it.name }

    val firstfruit = fruits.first()
    val firstfruitOrNull = fruits.firstOrNull()

    val lastfruit = fruits.last()
    val lastfruitOrNull = fruits.lastOrNull()

    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }
    val idMap: Map<Long, Fruit> = fruits.associateBy { it.id }

    val mapValue: Map<String, List<Long>> = fruits.groupBy({ it.name }, {it.factoryPrice})

    val mapFilter: Map<String, List<Fruit>> = fruits.groupBy { it.name }
        .filter { (key, value) -> key == "사과" }

    println(fruitsInList)
    println(convert)
}

val fruitsInList: List<List<Fruit>> = listOf(
    listOf(
        Fruit(1L, "사과", 1_000, 1_500)
    )
)

// 람다 중복
val samePriceFruit = fruitsInList.flatMap { list ->
    list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

val samePriceFruit_V2 = fruitsInList.flatMap { list -> list.samePriceFilter }

// List<List<Fruit>> -> List<Fruit>
val convert = fruitsInList.flatten()

