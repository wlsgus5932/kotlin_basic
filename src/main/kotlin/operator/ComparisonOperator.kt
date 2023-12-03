package operator

import java.util.Random

class ComparisonOperator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val random = Random()
            val a = random.nextInt(10)
            val b = random.nextInt(10)
            println("a: $a")
            println("b: $b")

            println(a>b)
            println(a>=b)
            println(a<b)
            println(a<=b)
            println(a==b)
            println(a!=b)

        }
    }
}