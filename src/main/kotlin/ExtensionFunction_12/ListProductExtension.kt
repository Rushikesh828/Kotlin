package ExtensionFunction_12

fun main() {

    val list = mutableListOf(2,4,6,8,5,3,6,7,9)
    val productOfList = list.product()
    println("Product of List $list : $productOfList")

}

fun MutableList<Int>.product() : Int {
    var product = 1
    for (i in this) {
        product *= i
    }
    return product
}