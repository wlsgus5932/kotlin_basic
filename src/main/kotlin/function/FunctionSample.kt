package function


fun main() {
    println(sum1(1,2))
    println(sum2(1,2))
    noReturnFunction("call")
    defaultParameter()
    namedArgument(a="park", c="hyun", b="jin") //파라미터 순서 상관 없음 굿
}

fun sum1(a: Int, b: Int): Int {
    return a+b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
    println("called $a")
}

fun defaultParameter(a: String = "default param") = println(a)

fun namedArgument(a: String, b:String, c:String) = println("$a, $b, $c")