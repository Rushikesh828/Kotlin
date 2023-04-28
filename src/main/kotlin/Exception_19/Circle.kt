package Exception_19

import kotlin.random.Random

class Circle(
    private val radius : Double
) : Shape("Circle") {

    companion object {

        fun randomCircle() : Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        if (radius > 0.0) {
            println("$name create with a radius of $radius")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        } else {
            throw Exception("Radius cannot be negative")
        }

    }

    override fun area() = ImportantNumbers.PI * radius * radius

    override fun perimeter() = 2 * ImportantNumbers.PI * radius
}