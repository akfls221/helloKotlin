package inheritclass

/**
 * 상속
 * 코틀린에서 상속은 클래스를 만들때 부모클래스(super class)의 요소를 물려받는 것을 말함.
 * 당연히 상속 받는 클래스를 자식클래스(sub Class)라고 함.
 * [중요 포인트]
 * 1. 상속하는 클래스는 open 키워드를 사용해줌.(open 키워드가 없는 클래스는 코틀린에서 final 클래스로 인식)
 * 2. 상속받는 클래스에서 부모클래스를 호출하는 생성자를 꼭 만들어 줘야함.(super() 사용)
 */
fun main() {

    var subClass: SubClass = SubClass()
    var subClass2: SubClass2 = SubClass2()

    subClass.superPrint()
    println("이것은 부모클래스의 변수 오버라이드 입니다. 이름 = ${subClass.name}, 나이 = ${subClass.age}")
    subClass.subPrint()
    println("=====================================================================================")
    subClass2.subPrint()
    subClass2.superPrint()
    println("이것은 부모클래스의 변수 입니다. 이름 = ${subClass2.name}, 나이 = ${subClass2.age}")

}

open class SuperClass{
    open var name: String? = "초기화"
    open var age: Int? = 0

    open fun superPrint() {
        println("this is super Class")
    }
}

class SubClass : SuperClass {
    constructor() : super()

    override var name: String? = "엄태권"
    override var age: Int? = 29

    fun subPrint() {
        println("this is sub Class")
    }

}


class SubClass2 : SuperClass() {
    fun subPrint() {
        println("this is sub Class2")
    }

}