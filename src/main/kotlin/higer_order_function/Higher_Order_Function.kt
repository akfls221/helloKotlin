package higer_order_function

/**
 * Higher-Order Functions(고차함수)란 함수의 인자로 다른 함수를 받거나 또는 함수 자체를 반환하는 함수이다.
 */
fun main() {


    println(calculate(1, 2, ::sum)) // :: -> 함수를 참조하는 코틀린 언어
    println(calculate(1, 2) { x, y -> x * y }) //{}부분은 함수

    println(StringAdd("엄태", "권") {c1, c2 -> "$c1$c2 최고"})
    println(StringAdd("엄태", "권", ::plusString))

    println(toStringReturn(2))




}

fun sum(x: Int, y: Int) = x + y

fun plusString(c1 : String, c2: String) = c1+c2

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun toStringReturn(x: Int) : String {
    return x.toString()
}

fun StringAdd(c1: String, c2: String, highFun: (String, String) -> String): String {
    return highFun(c1, c2)
}

fun returnFun(): (Int) -> (String) {
    return ::toStringReturn
}
