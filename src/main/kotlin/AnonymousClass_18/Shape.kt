package AnonymousClass_18

abstract class Shape(
    var name: String
) {

    constructor(name: String, a : Double, b : Double, height : Double) : this(name)

    constructor(name: String, top : Double, bottom : Double, left : Double, right : Double, height : Double) : this(name)

    init {
        println("$name superclass Created")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName: String) {
        name = newName
    }
}