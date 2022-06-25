@file:JvmName("AbstractStudyKt")

package abstractandinterface

fun main() {

    val abstract = ChildClass("taekwon", 29)
    abstract.doSomething()
    abstract.sleep()
    abstract.displayInfo()
    abstract.childFun()
    println("추상 클래스 프로퍼티 초기화 : ${abstract.address}")

}

//AbstractStudy 변수 생성자를 위해 필수로 주입 필요
class ChildClass (name: String, age: Int) : AbstractStudy(name, age) {

    override var birth: String = "1994-09-17"


    override fun doSomething() {
        println("this is Parent doSomething Function")
    }

    override fun sleep() {
        println("this is Parent Sleep Function")
    }

    fun childFun(){
        println("this is child Function")
    }

}