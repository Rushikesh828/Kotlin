package LogicAndComparission_4

fun main() {
    val simpleExpression = 3>4 || 4>3 && 4<=4
    println(simpleExpression)

    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val e = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    println(e)
}