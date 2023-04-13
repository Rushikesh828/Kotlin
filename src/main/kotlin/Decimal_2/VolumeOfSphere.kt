package Decimal_2

import java.util.Scanner

fun main() {
    print("Enter radius of sphere:")
    val reader = Scanner(System.`in`)
    var radius = reader.nextFloat()
    val pie : Float = 3.14F

    println("Volume of sphere is: ${1.33333333 * pie * radius * radius * radius}")
}