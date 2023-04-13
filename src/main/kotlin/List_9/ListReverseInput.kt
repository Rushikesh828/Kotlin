package List_9

fun main() {
    val myList = mutableListOf<Int>()

    println("Enter Any 5 Integer Number")

    for (i in 1..5){
        val input = readln()
        myList.add(input.toInt())
    }

    var newList = myList.reversed()

    for (i in newList){
        println(i)
    }

}