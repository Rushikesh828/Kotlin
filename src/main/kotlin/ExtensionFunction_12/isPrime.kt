package ExtensionFunction_12

fun main() {
    println("Input an Integer number:")
    val num = readln()?.toInt()
    if (num != null) {

        if (num.isPrime()){
            println("Number $num is Prime")
        } else {
            println("Number $num is not Prime")
        }
    }
}

fun Int.isPrime() : Boolean {
    for(i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}