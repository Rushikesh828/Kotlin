package FunctionAndPrams_11

fun main() {
    val myList = listOf<Int>(1, 8, 4, 5, 6, 9, 3, 0, 2, 7)
    println("List is $myList")
    println("Enter any element to find it's position from list : ")
    val input = readln()
    var position = search(myList, input.toInt())

    if (position == -1){
        println("Number not present in list")
    } else {
        println("Position of ${input.toInt()} is $position")
    }

}

fun search(list: List<Int>, n : Int) : Int {
    var position = -1

    for (i in list) {
        if (i == n) {
            position = list.indexOf(i) + 1
        }
    }

    return position
}