package find_findlast

/**
 * find : 조건에 만족하는 첫번째 구성자를 넘겨줌
 * findLast : 조건에 만족하는 마지막 구성자를 넘겨줌
 */
fun main() {
    val words = listOf("test1", "test2", "test3", "test4")

    val first = words.find { it -> it.startsWith("test") } // test1
    val last = words.findLast { it -> it.startsWith("test") } // test4

    val nothing = words.find { it.startsWith("nothing") } //null
    
    
    println(first)
    println(last)
    println(nothing)

}
