package collections.map_notMap

/**
 * map 의경우 collection을 확장하여 하나씩 꺼내와 로직을 실행하고 그 결과값을 다시 반환함.
 */
fun main() {

    val numbers = listOf(1,2,3,4,5)
    val double = numbers.map { number -> number * 2 }
    val tripled = numbers.map { number -> number * 3 }
    val minus1 = numbers.map { number -> number - 1 }

    println(double)
    println(tripled)
    println(minus1)
}