package When_10

fun main() {
    print("Where are you from?")
    val input = readln().lowercase()

    when(input) {

        "india" -> println("Namaste")

        "usa" -> println("Hello")

        "germany" -> println("Hallo")

        "russia" -> println("privet")

        else -> println("I don't know")

    }

}