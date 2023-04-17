package Class_13

class Circle(
    private val radius : Double
) {
    val pi = 3.141592

    init {
        println("Corcle create with a radius of $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    fun area() = pi * radius * radius

    fun perimeter() = 2 * pi * radius
}