package ConstructorFunctionOverloading_16

import kotlin.math.sqrt

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape("Triangle") {

    init {
        println("Triangle created with side A = $sideA, side B = $sideB, side C = $sideC")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    override fun area(): Double {
        val semiParam = (sideA + sideB + sideC) / 2
        return sqrt(semiParam * (semiParam - sideA) * (semiParam - sideB) * (semiParam - sideC))
    }

    override fun perimeter() = sideA + sideB + sideC
}