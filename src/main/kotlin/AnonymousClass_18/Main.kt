package AnonymousClass_18

fun main() {
    val a = 3.0
    val b = 4.0
    val height = 2.0

    val parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("Parallelogram created")
            println("Area is ${area()}")
            println("Perimeter is ${perimeter()}")
        }

        override fun area(): Double = a * height

        override fun perimeter(): Double = 2 * (a + b)

        fun isRectangle() = b == height
    }

    val top = 5.0
    val bottom = 8.0
    val side = 7.0
    val heightT = 4.0

    val trapeze = object : Shape("Trapeze", top, bottom, side, side, heightT) {

        init {
            println("Trapeze created")
            println("Area is ${area()}")
            println("Perimeter is ${perimeter()}")
        }

        override fun area(): Double = ((top + bottom)/2) * heightT

        override fun perimeter(): Double = top + bottom + side + side

    }
}