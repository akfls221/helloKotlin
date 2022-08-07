package minornull_maxornull

/**
 * minOrNull = 주어진 리스트의 최소값을 리턴하며 없을 경우 null
 * maxOrNull = 주어진 리스트의 최대값을 리턴하며 없을 경우 null
 */
fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val onlyOne = listOf(3)


    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")
    println("Only: $onlyOne, min = ${onlyOne.minOrNull()}, max = ${onlyOne.maxOrNull()}")
}