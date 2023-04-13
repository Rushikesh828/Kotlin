package WhileLoopArray_7

fun main() {

    println("Enter Desired Number: ")
    var number = readln()
    var numberInt = number.toInt()
    while (numberInt >= 0) {
        println(numberInt)
        numberInt--
    }

}