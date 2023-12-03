package loop
class ForSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // i++
            for (i in 1..5) println(i)
            println()

            // i--
            for (i in 5 downTo 1) println(i)
            println()

            // i+2
            for (i in 1..5 step 2) println(i)
            println()
        }
    }
}