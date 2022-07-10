package conditionalcheck

/**
 * Kotlin에선 삼항 연산자가 없음.
 * 이를 대신하기 위해 if문 을 쓸 수 있음.(코틀린에선 변수명에 if문의 결과값 대입이 가능함.)
 */

fun main() {

    println(selectMax(99, 42))

}

fun selectMax(a: Int, b: Int) = if(a > b) a else b