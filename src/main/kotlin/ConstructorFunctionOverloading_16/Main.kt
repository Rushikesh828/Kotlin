package ConstructorFunctionOverloading_16

fun main() {
    val myRectangle = Rectangle(6.0, 6.0)
    println()
    val rect1 = Rectangle(8.0)
    println()
    val rect2 = Rectangle(6,9)
    println()
    val circle = Circle(7.8)
    println()

    println("Area of Rect1 is ${rect1.area()}")
    println("Area of Rect2 is ${rect2.area()}")
    println("Area of Circle is ${circle.area()}")
    println()
    println("Max are out of rect1 and rect2 is ${maxArea(rect1, rect2)}")
    println("Max are out of rect1, rect2 and circle is ${maxArea(rect1, rect2, circle)}")

    val originalList = mutableListOf(1,2,3,4,5,6,7)
    val originalArray = arrayOf(1,2,3,4,5,6,7)

    val firstLastPrint = FirstLastPrint()
    firstLastPrint.firstLastPrint(originalList)
    firstLastPrint.firstLastPrint(originalArray)

}

fun maxArea(shape1 : Shape, shape2: Shape) : Double {
    val area1 = shape1.area()
    val area2 = shape2.area()
    return if (area1 > area2) area1 else area2
}

fun maxArea(shape1: Shape,  shape2: Shape, shape3: Shape) : Double {
    val areaMax12 = maxArea(shape1, shape2)
    val area3 = shape3.area()
    return if (area3 > areaMax12) area3 else areaMax12
}
