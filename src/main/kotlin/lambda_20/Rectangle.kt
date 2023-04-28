package lambda_20

class Rectangle(
    private val height : Double,
    private val width : Double
) : Shape("Rectangle") {

    constructor(a: Double) : this(a ,a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

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