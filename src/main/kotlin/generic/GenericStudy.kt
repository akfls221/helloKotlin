package generic

fun main() {

    val genericTest = GenericTest(1, "이", 3, 4)
    val genericTest2 = GenericTest<String>("1", "2")

    genericTest.push("5")
    genericTest.push("Test")

    println("마지막 출력 : ${genericTest.last()}")
    println("리스트 size 출력 : ${genericTest.size()}")
    println("마지막 출력 : ${genericTest2.last()}")
    println("리스트 size 출력 : ${genericTest2.size()}")

    genericFunction<String>("String")
    genericFunction<Int>(1)


}

class GenericTest<E>(vararg arg: E) {

    private val itemList = arg.toMutableList()

    fun push(item : E) = itemList.add(item)

    fun last(): E = itemList.last()

    fun size(): Int = itemList.size
}

fun <T>genericFunction(arg: T) {
    println(arg)
}