package flatmap

/**
 * map : 배열의 각 요소를 하나하나 순회하여 그요소를 조작하고, 조작한 요소들을 배열로 리턴해 줌.
 *
 * flatMap : map처럼 결국 배열을 리턴함, flatMap은 먼저 매핑 함수를 사용해 각 엘리먼트에대해 map을 수행 후, 결과를 새로운 배열로 평평화한다
 *          감싸져 있는 collection을 하나로 합치기 위한 연산임.
 */
fun main() {

    val fruitsBag = listOf("apple", "oragne", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val forMap = cart.map { it + "for Map" } //map은 각 요소를 조작하여 list로 return이 가능함. 여기서 it은 fruitBag 과 clothesBag을 순회함.
    println(forMap)

    val forFlatMap = cart.flatMap { it }

    println(forFlatMap) // flatmap은 하나의 list로 return함.
}