package Class_13

fun main() {
    val myRectangle = Rectangle(6.0, 6.0)
    println("Rectangle area is ${myRectangle.area()}")
    println("Rectangle perimeter is ${myRectangle.perimeter()}")
    println("Is Rectangle a square? ${myRectangle.isSquare()}")
    println()

    val myCircle1 = Circle(5.0)
    println()

    val myCircle2 = Circle(7.0)
    println()

    val myPerimeter = Triangle(4.0, 4.0, 4.0)
}
