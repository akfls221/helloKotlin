package varargs

/**
 * 가변인자로 가변인자를 사용하면 함수를 호출할 때 인자 개수를 유동적으로 지정이 가능함.
 * 쉽표를 기준으로 분리함.
 */

fun main() {

    fun printAll(vararg str: String) {
        for(h in str) println(h)
    }

    printAll("hello", "nice", "kotlin")

    fun printSum(vararg num: Int) {
        println(num.sum())
    }

    printSum(1,2,3,4,5,6)
}