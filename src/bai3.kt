fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.size)
    println(numbers[0])

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,4,5)
    println(set1.intersect(set2))
    println(set1.union(set2))

    val peopleAges = mutableMapOf(
        "Fred" to 30,
        "Ann" to 23
    )

    peopleAges["Joe"] = 51

    println(
        peopleAges.map { "${it.key} is ${it.value}" }
            .joinToString(", ")
    )
}
