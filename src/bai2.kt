abstract class Dwelling {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

class SquareCabin(val length: Double) : Dwelling() {
    override val buildingMaterial = "Wood"

    override fun floorArea(): Double {
        return length * length
    }
}

fun main() {
    val house = SquareCabin(5.0)
    println(house.buildingMaterial)
    println(house.floorArea())
}
