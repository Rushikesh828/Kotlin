package FunctionAndPrams_11

fun main() {
    mathPow(3, 4)
}

fun mathPow(base: Int, power: Int) {

    var result = 1

    for(i in 1..power) {
        result *= base
    }

    print("$base times $power equals to $result")
}