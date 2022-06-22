package abstractandinterface

/**
 * Interface와 다르게 프로퍼티의 초기화가 가능함.
 * Java와 동일하게 일반적인 객체를 생성하는 방법으로 인스턴스화 될 수 없으며, 이를 상속받는 클래스에서 구체화가 가능함.
 * 참고로 클래스 상속을 위해선 부모 클래스를 oen으로 해야 하지만, 추상 클래스는 open을 할 필요가 없으며 프로퍼티, 메소드또한 마찬가지임.
 */
abstract class AbstractStudy(val name:String, val age : Int) {
    
    //abstract로 정의한 추상 프로퍼티로 구현체(하위 클래스)에서 반드시 재정의 필요
    abstract var birth : String
    
    //마찬가지로 하위 구현체 에서 반드시 재정의 필요
    abstract fun doSomething()
    abstract fun sleep()

    // 초기값을 갖는 일반 프로퍼티 (인터페이스에선 불가능함)
    val address:String = "서울특별시"

    fun displayInfo() {
        println("안녕하세요 추상 클래스 테스트 작업입니다. $name 님 안녕하세요 $age 살 이시네요 $address 사시고, 생일은 $birth 이시네요")
    }
}