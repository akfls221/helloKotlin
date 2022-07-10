package range

/**
 * for 문을 좀더 편하게
 * for(i=0; i<=3; ++i) 와 동일한 조건 > for(i in 0 in 0..3)
 * 1. until : until 부분의 마지막 숫자는 포함하지 않음.
 * 2. set : 2단계씩 건너 띄어서 출력
 * 3. downTo : 아래로 내려가면서
 */ 
fun main() {

    for (i in 0..3) {
        println(i) //0123
    }

    println("=========================================")

    for (i in 0 until 3) {
        println(i) //012
    }

    println("=========================================")

    for(i in 2..8 step 2) {      // 2 4 6 8
        println(i)
    }

    println("=========================================")

    for (i in 3 downTo 0) {      // 4
        println(i)
    }

    println("=========================================")

    /**
     * 문자(char) 또한 연속한 범위내에선 가능함.
     *
     */
    for (c in 'a'..'d') {
        println(c) //abcd
    }

    println("=========================================")

    for (c in 'a' until 'd') {
        println(c) //abc
    }

    println("=========================================")

    for(c in 'a'..'d' step 2) {
        println(c) // ac
    }

    println("=========================================")

    for (c in 'd' downTo 'a') {      // 4
        println(c) // dcba
    }

    println("=========================================")

    /**
     * if 문에서의 in절 활용
     */
    val x = 2
    if (x in 0..3) {
        println("x 는 2로 in절안에 포함됩니다.")
    } else {
        println("x 는 2로 in절안에 포함되지 않습니다..")
    }

}