package infix

/**
 * Infix 함수는 두 변수 가운데 오는 함수를 말하며, 기본적으로 정의된 infix 함수들 중에는 Pair를 만드는
 * to(map에서 사용됨) 이있음.
 */

fun main() {

    infix fun Int.time(str: String) = str.repeat(this)
    println("infx time test : ${2 time  "taekwon"}")

    val pair = "hello" to "Kotlin"
    println("this is pair : $pair")

    val study = Study("user1")
    study.likes("user1")
    println("infix likes function : ${study.likeList}")

}

class Study(str: String){
    var likeList = mutableListOf<String>()
    infix fun likes(person: String) {likeList.add(person)}
}