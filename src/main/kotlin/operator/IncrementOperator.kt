package operator

class IncrementOperator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 5
            val b = a++
            val c = a
            val d = ++a
            println(a)
            println(b)
            println(c)
            println(d)

            println("----------------------------")

            //연산이 변수 앞,뒤 위치에 따라 출력시점이 달라짐
            var e = 5
            println(e)
            println(e++)
            println(++e)
            println(e)
            println(e--)
            println(--e)
        }
    }
}