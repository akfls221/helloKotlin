package collections.filter

/**
 * Filter 기능은 컬렉션을 필터링할 수 있음.
 * 람다 매개변수로 사용하여, 해당되는 것들을 반환함.
 */
fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, -1, -2, -3, -4, -5)
    val 양수 = numbers.filter { number -> number > 0}
    val 음수 = numbers.filter { number -> number < 0 }
    
    println(양수)
    println(음수)
    
}