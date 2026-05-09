fun printHello () {
    println ("Hello Kotlin")
}

fun roll(): Int {
    return (1..6).random()
}

fun main() {
    val age = "5"
    val name = "Rover"

    println("You are already ${age} days old, ${name}!")

    printHello()

    val num = 4
    if (num > 4) println("Greater than 4")
    else if (num == 4) println("Equal to 4")
    else println("Less than 4")

    val rollResult = roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You won!")
        else -> println("You rolled $rollResult")
    }
}
