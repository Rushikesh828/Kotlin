package Inheritance_14

fun main() {
    val myRectangle = Rectangle(6.0, 6.0)
    myRectangle.changeName("MyRectangle")
    println(myRectangle.name)
    println()

    val myCircle1 = Circle(5.0)
    myCircle1.changeName("MyCircle1")
    println(myCircle1.name)
    println()

    val myCircle2 = Circle(7.0)
    myCircle2.changeName("MyCircle2")
    println(myCircle2.name)
    println()

    val myTriangle = Triangle(4.0, 4.0, 4.0)
    myTriangle.changeName("MyTriangle")
    println(myTriangle.name)
}
