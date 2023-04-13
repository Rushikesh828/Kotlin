package FunctionAndPrams_11

fun main() {
    var sum = alternatingSum(2,4,5,6,3,6,7,3,4,2)
    println(sum)
}

fun alternatingSum(vararg numbers: Int) : Int {
    var sum = 0
    var place = true
    for (number in numbers) {
        if (place){
            sum += number
            place = false
        } else {
            sum -= number
            place = true
        }
    }

    return sum
}