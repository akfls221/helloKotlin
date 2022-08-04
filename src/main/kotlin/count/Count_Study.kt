package count

/**
 * 주어진 조건을 만족하는 구성자를 count 한다.
 */
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val count = numbers.count{ it * 2 == 4}

    println(count) // 1
}