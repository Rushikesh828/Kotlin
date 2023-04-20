package ConstructorFunctionOverloading_16

class Circle(
    private val radius : Double
) : Shape("Circle") {

    private val pi = 3.141592

    init {
        println("$name create with a radius of $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = pi * radius * radius

    override fun perimeter() = 2 * pi * radius
}