package ObjectAndCompanionObject_17

abstract class Shape(
    var name: String
) {
    init {
        println("$name superclass Created")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName: String) {
        name = newName
    }
}