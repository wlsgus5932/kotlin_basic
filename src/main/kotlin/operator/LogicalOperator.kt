package operator

import java.util.Random

class LogicalOperator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val random = Random()
            val a = random.nextInt(10)
            val b = random.nextInt(10)
            val c = random.nextInt(10)
            val d = random.nextInt(10)

            println("a: $a, b: $b, c: $c, d: $d")

            println(a>b && c>d)
            println(a>b || c>d)
            println(!(a>b))

        }
    }
}