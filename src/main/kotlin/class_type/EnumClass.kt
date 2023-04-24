package class_type

/**
 * Enum Class
 * when과 사용할 때 매우 편리
 */

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}