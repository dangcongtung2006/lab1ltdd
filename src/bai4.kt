fun main() {

    // try - catch
    try {
        val x = 10 / 0
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // enum + when
    val direction = Direction.NORTH
    when (direction) {
        Direction.NORTH -> println("North")
        Direction.SOUTH -> println("South")
        Direction.WEST -> println("West")
        Direction.EAST -> println("East")
    }
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
