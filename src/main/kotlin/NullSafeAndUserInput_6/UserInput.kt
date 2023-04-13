package NullSafeAndUserInput_6

fun main() {
    print("Enter your age : ")
    val inputAge = readLine()
    if (inputAge != null){
        if (inputAge.toInt() >= 18)
            println("You are an adult")
        else
            println("You are not adult")
    }
}