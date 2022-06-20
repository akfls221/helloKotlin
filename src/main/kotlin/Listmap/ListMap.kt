package Listmap

fun main() {
    val items = listOf("apple", "banana", "watermelon")
    val hasNullItem = listOf("apple", "banana", "watermelon", null)

    val itFilter = items.filter { it.startsWith("a") }
    val filter = items.filter { x -> x.startsWith("a") }
    val nullFilter = hasNullItem.filterNotNull().filter { it.startsWith("a") }

    println("filter:  $filter")
    println("nullFilter : $nullFilter")
    println("itFilter : $itFilter")

    /**
     * MutableList / immutable List
     */
    val test = ArrayList<Any>()
    test.add(3)
    test.add("test")


    val array = mutableListOf(1, 2, 3, 4, 5)
    //listof 의 경우 값이 변하지 않는 가정 var로 선언시 add or += 가능
    var array2 = listOf(1, 2, 3, 4, 5)
    array.add(10)
    array2+=10
    println("mutable List : $array")
    println("mutable List : $array2")

    /**
     * immutable Map / MutableMap
     */
    val map = mapOf(1 to "x", 2 to "Y")

    //가변 가능 mutableMap
    val mutableMap = mutableMapOf(1 to "test", 2 to "test2")
    mutableMap.put(3, "test3")
    print("mutableMap : $mutableMap")



}