package AbstractClass_15

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

    override fun area() = height * width

    override fun perimeter() = 2 * (height + width)

    fun isSquare() = height == width
}