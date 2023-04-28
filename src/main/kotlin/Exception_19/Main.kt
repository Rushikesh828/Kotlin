package Exception_19

import java.lang.NumberFormatException

fun main() {

//    val input = try {
//        readLine()?.toInt()
//    } catch (e : NumberFormatException) {
//        0
//    }

    try {
        val circle = Circle(2.0)
    } catch (e: Exception) {
        e.printStackTrace()
    }

    try {
        val circle1 = Circle(-2.0)
    } catch (e: Exception) {
        println("Circle 1 has negative radius")
    }


}