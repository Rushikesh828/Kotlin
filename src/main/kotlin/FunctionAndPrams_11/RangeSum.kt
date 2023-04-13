package FunctionAndPrams_11

fun main() {
    rangeSum(100,500)

    println("Single Expression Function ${multiply(14, 10)}")
}

fun rangeSum(sN: Int, eN: Int) {

    var result = (eN * (eN + 1))/2
    val deductNumber = sN-1
    var deductResult = (deductNumber * (deductNumber + 1))/2
    var finalResult = result - deductResult

    println("The sum from $sN to $eN is $finalResult")
}

//single expression function
fun multiply(n1 : Int, n2 : Int) = n1 * n2