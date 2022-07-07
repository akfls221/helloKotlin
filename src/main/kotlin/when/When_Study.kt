package `when`

/**
 * if else 와 같은 것으로 보임.
 * 즉 위에서 걸리는 것이 있으면 다음에 걸리는 것이 있더라도 처음 걸리는 조건에 해당하는 결과값 도출됨.
 */

fun main() {

    cases(1)
    cases("?")
    cases("@")
    cases(3)

    println("=======================================")


    println(whenAssign(1))
    println(whenAssign("?"))
    println(whenAssign("@"))
    println(whenAssign(3))

}

fun cases(arg: Any) {
    when (arg) {
        1 -> println("1입니다")
        "?" -> println("물음표 입니다.")
        is Int -> println("정수입니다")
        !is String -> println("스트링이 아닙니다.")
        else -> println("else 입니다.")
    }
}
fun whenAssign(arg: Any) : Any{
    val result = when (arg) {
        1 -> "one"
        "?" -> "물음표 입니다."
        is Int -> "정수입니다"
        !is String -> "스트링이 아닙니다."
        else -> "else 입니다."
    }
    return result
}