package abstractandinterface

/**
 * 인터페이스는 프로퍼티를 반드시 재정의 해야 하는 것을 보장함.
 * 따라서 재정의를 보장하기 때문에 인터페이스 내에서 초기화가 불가능함.
 * 멤버 함수의 경우 부모 인터페이스에서 정의가 되어 있다면 반드시 재정의해야할 필요는 없음.
 * 그러나 선언만 되어 있는 경우(정의 되어 있지 않는 경우) 오버라이딩 구현이 필요함.
 * @ 추가로 코트린의 경우 한 파일에서 2개의 클래스 혹은 인터페이스와 그를 상속하는 클래스가 있을 경우 kt 확장자로 등록됨.
 */
interface InterfaceStudy {
    var name:String
    //val age:Int = 11  오류발생(프로퍼타 초기화)

    fun doSomething()

    fun printScreen():Unit {
        println("this is interface func")
    }
}

interface InterfaceStudy2 {
    var name:String

    fun doSomething()

    fun printScreen() {
        println("this is interface func")
    }
}