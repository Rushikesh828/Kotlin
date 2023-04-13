package WhileLoopArray_7

fun main() {

    println("Enter number 1: ")
    var number1 = readln()
    var n1 = number1.toInt()

    println("Enter Number 2: ")
    var number2 = readln()
    var n2 = number2.toInt()

    var multiplyResult = n1

    while ((n2-1) > 0) {
        multiplyResult = multiplyResult * n1
        n2--
    }

    println("$n1 to the power of ${number2.toInt()} is $multiplyResult")

}