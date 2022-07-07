package loops

/**
 * for 문은 다른 for문과 동일함.
 * 다만 in 이라는 infix 함수로 대체 하여 for문을 돌림.
 */
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println("숫자나열 시작! $number !")
    }

    /**
     * while and do-while
     */
    fun startRun() = println("start Run!!")
    fun startWalk() = println("start Walk!!")

    var energy = 5
    var plusEnergy = 0

    while (energy > 0) {
        startRun()
        energy--
    }

    do {
        startWalk()
        plusEnergy++
    } while (plusEnergy < 5)

}

