package ForLoop_8

fun main() {

    var avg = 0.0
    println("Enter 5 Numbers:")

    for (i in 1..5){
        val input = readln().toInt()
        avg += input / 5.0

    }

    println("Average of 5 numbers is $avg")
}