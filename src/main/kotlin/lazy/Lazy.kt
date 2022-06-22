package lazy

/**
 * 늦은 초기화
 * class의 전역에 값을 생성하면 클래스가 만들어지는 시점에서 변수를 함께 초기화 하기 떄문에 빠르게 접근이 가능함.
 * 그러나 꼭 써야할 변수가 아니라면 오히려 메모리 손해가 있을 수 있어 필수 요건이 아닌 경우 늦은 초기화 작업이 필요함.
 * ex) lateinit, lazy
 */
fun main() {

    val test = LateInit()
    test.firstName = "hello lateInit"
    test.lateInit()

    val lazy = Lazy()
}

class LateInit {
    //Int 타입의 경우 에러가 발생하며, 이유는 기초 타입 프로퍼티에는 사용이 불가하기 때문임.(var에서 사용가능)
    lateinit var firstName : String

    fun lateInit() {
        println("before firstName : $firstName")
    }
}

/**
 * Lazy
 * 초기화 지연
 * 호출 시점에 by lazy 정의에 의해서 초기화를 진행함.
 * val에서만 사용가능
 * 초기화를 위해서는 함수명이라도 적어야 함.
 * lazy를 사용하는 경우 기본 Synchronized로 동작함.
 */
class Lazy{

    val name : String by lazy {
        println("this is lazy mode") // 출력 2
        "this is lazy"
    }

    init {
        println("here is the init function") // 출력 1
        println("init name : $name") // 출력 3 > by lazy 이후 출력
    }


}