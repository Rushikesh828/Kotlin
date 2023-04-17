package Inheritance_14

class Circle(
    private val radius : Double
) : Shape("Circle") {

    private val pi = 3.141592

    init {
        println("$name create with a radius of $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = pi * radius * radius

    fun perimeter() = 2 * pi * radius
}