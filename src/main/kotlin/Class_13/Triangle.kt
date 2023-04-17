package Class_13

import kotlin.math.sqrt

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) {
    init {
        println("Triangle created with side A = $sideA, side B = $sideB, side C = $sideC")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    fun area(): Double {
        val semiParam = (sideA + sideB + sideC) / 2
        return sqrt(semiParam * (semiParam - sideA) * (semiParam - sideB) * (semiParam - sideC))
    }

    fun perimeter() = sideA + sideB + sideC
}