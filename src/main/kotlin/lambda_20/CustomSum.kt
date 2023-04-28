package lambda_20

fun main() {
    val intList = (1..10).toList()
    val total = intList.customSum { it % 2 == 1 }

    println(total)
}

fun List<Int>.customSum(intList: (Int) -> (Boolean)) : Int {
    var sum = 0
    for (i in this){
        if (intList(i)){
            sum += i
        }
    }
    return sum
}