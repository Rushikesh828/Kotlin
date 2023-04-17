package Inheritance_14

open class Shape(
    var name: String
) {
    init {
        println("$name superclass Created")
    }

    fun changeName(newName: String) {
        name = newName
    }
}