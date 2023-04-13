package ForLoop_8

fun main() {

    /*for (i in 1..10) {
        println(i)
    }*/

    /*for (i in 10 downTo 2 step 2) {
        println(i)
    }*/

    /*for (i in 'a'..'z') {
        print("$i ")
    }*/

    val myArray = arrayOf(20, 22, 13, 18, 3, 29, 8, 18)
    var max = myArray[0]

    for (i in myArray) {
        if (i > max) {
            max = i
        }
    }

    println(max)
}