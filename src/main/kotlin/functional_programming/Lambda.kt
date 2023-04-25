package functional_programming


fun main() {
    val fruits = listOf(
        Fruit(1L, "사과", 1_000, 1_000),
        Fruit(2L, "사과", 1_200, 1_000),
        Fruit(3L, "사과", 1_200, 1_000),
        Fruit(4L, "사과", 1_500, 1_000),
        Fruit(5L, "바나나", 3_000, 1_000),
        Fruit(6L, "바나나", 3_500, 1_000),
        Fruit(7L, "바나나", 3_200, 1_000),
    )


    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit -> fruit.name == "사과"}

    isApple2(fruits[0])

    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })

    // 함수가 마지막 인자일 경우 중괄호 밖에 선언 가능
    filterFruits(fruits) {fruit -> fruit.name == "사과"}

    // 익명 함수의 파라미터가 한개일 경우 it으로 사용 가능
    filterFruits(fruits) { it.name == "사과"}
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}

private fun filterFruits_V2(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}