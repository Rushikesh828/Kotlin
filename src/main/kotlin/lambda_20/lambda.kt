package lambda_20

import org.w3c.dom.css.Rect

fun main() {
    var list = (1..20).toList()
    println("Original list : $list")

    println()

    //lambda function
    list = list.filter { it % 2 == 0 }

    println("Filtered list : $list")


    var circle1 = Circle(4.6)
    circle1.changeName("circle1")

    var circle2 = Circle(11.1)
    circle2.changeName("circle2")

    var rect1 = Rectangle(3.0, 5.0)
    rect1.changeName("rect1")

    var rect2 = Rectangle(6.0, 3.0)
    rect2.changeName("rect2")

    var tri1 = Triangle(5.0, 5.0, 5.0)
    tri1.changeName("tri1")

    var tri2 = Triangle(6.0, 5.0, 8.0)
    tri2.changeName("tri2")

    var shapes = listOf(circle1, circle2, tri1, tri2, rect1, rect2)

    shapes = shapes.customFilter { it.area() > 15 }.sortedBy { it.area() }

    for (shape in shapes) {
        println("${shape.name}: ${shape.area()}")
    }

}

fun List<Shape>.customFilter(filterFunction: (Shape) -> (Boolean)) : List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}