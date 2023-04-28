package Generics_21

class CustomTripleGeneric<A : Any, B : Any, C : Any>(
    val first: A,
    val second: B,
    val third: C
) {
    fun printTypes() {
        println("The first parameter type is ${first::class}")
        println("The second parameter type is ${second::class}")
        println("The third parameter type is ${third::class}")
    }
}