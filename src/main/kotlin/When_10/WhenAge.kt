package When_10

fun main() {
    val age = readln().toInt()

    when(age) {
        in 0..5 -> println("Young Kid")

        in 6..17 -> println("Teenager")

        18 -> println("Just became an adult")

        19, 20 -> println("Young Adult")

        in 21..65 -> println("An adult")

        else -> println("Very Adult")
    }
}