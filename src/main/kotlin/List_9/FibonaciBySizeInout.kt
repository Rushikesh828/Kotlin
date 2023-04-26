package List_9

fun main() {

    println("Enter number greater than 1: ")
    var input = readln().toInt()
    var myList = mutableListOf<Int>(0,1)
    var n1 = 0
    var n2 = 1
    var n3 = 0

    if (input > 1){
        if (input > 2){
            for (i in 3..input){

                n3 = n2 + n1
                myList.add(n3)
                n1 = n2
                n2 = n3
            }
        }

        println(myList)

    } else{
        println("Number is not greater than one.")
    }
}