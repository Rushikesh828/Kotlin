package ForLoop_8

fun main() {
    val myArray = arrayOf(1, 8, 4, 5, 6, 7, 3, 9, 2)
    var result = 0

    for (i in myArray) {
        result = result + i
    }

    println("Result is $result")
}