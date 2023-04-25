package etc

import functional_programming.Fruit

/**
 * Type Alias
 * 긴 이름의 클래스 혹은 함수 타입이 있을 때 축약하거나 더 좋은 이름을 쓰는 방법
 *
 * as import
 * 다른 패키지의 같은 함수 이름을 import
 *
 */

typealias FruitFilter = (Fruit) -> Boolean

private fun filterFruits(
    fruits: List<Fruit>, filter: FruitFilter
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}