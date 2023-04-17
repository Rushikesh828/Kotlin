package Class_13

class Rectangle(
    private val height : Double,
    private val width : Double
) {
    init {
        println("Rectangle created with height = $height and width = $width")
    }

    fun area() = height * width

    fun perimeter() = 2 * (height + width)

    fun isSquare() = height == width
}