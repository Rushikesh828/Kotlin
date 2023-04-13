package IfElse_5

fun main() {
    val android : String = "android_dev"
    val raceCar : String = "racecar"

    if (android == android.reversed()) {
        println("$android is palindrome")
    } else {
        println("$android is not palindrome")
    }

    if (raceCar == raceCar.reversed()) {
        println("$raceCar is palindrome")
    } else {
        println("$raceCar is not palindrome")
    }
}