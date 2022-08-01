package collections.any_all_none

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    /**
     * any
     * 여러개 중 하나만 참이여도 true가나오며, 모두 거짓일 경우 false return
     */
    val anyFalse = numbers.any { number -> number > 9 }
    val anyTrue = numbers.any{it == 2}

    println("any $anyTrue")
    println("any $anyFalse")


    /**
     * all
     * 모든 요소가 컬렉션과 매치될 경우 true 하나라도 거짓일 경우 false
     */
    val allFalse = numbers.all { it % 2 == 0 }
    val allTrue = numbers.all { it > 0 }
    println("all $allTrue")
    println("all $allFalse")


    /**
     * none
     * 모든 결과가 매치되지 않았을 경우 true 리턴 하나라도 매치될 경우 false 리턴
     */
    val noneTrue = numbers.none { it > 9 } // 모두 매치되지 않기 때문에 true 리턴
    val noneFalse = numbers.none { it < 9 } // 모두 맞기때문에 false 리턴
    println("none $noneFalse")
    println("none $noneTrue")
}