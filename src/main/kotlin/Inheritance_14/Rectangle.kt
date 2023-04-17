package Inheritance_14

class Rectangle(
    private val height : Double,
    private val width : Double
) : Shape("Rectangle") {

    init {
        println("$name created with height = $height and width = $width")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
        println("Is $name a square? ${isSquare()}")
    }

    fun area() = height * width

    fun perimeter() = 2 * (height + width)

    fun isSquare() = height == width
}