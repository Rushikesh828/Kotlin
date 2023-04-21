package ObjectAndCompanionObject_17

import kotlin.random.Random

class Rectangle(
    private val height : Double,
    private val width : Double
) : Shape("Rectangle") {

    companion object {
        fun randomRectangle() : Rectangle {
            val height = Random.nextDouble(1.0, 100.0)
            val width = Random.nextDouble(1.0, 100.0)
            return Rectangle(height, width)
        }
    }

    init {
        println("$name created with height = $height and width = $width")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
        println("Is $name a square? ${isSquare()}")
    }

    override fun area() = height * width

    override fun perimeter() = 2 * (height + width)

    fun isSquare() = height == width
}