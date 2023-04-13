package WhileLoopArray_7

fun main() {
    val myArray = arrayOf("home", "furniture", "plane", "boat")
    println("Size of array: ${myArray.size}")
    var x = 0
    while (x < myArray.size) {
        println(myArray[x])
        x++
    }
}