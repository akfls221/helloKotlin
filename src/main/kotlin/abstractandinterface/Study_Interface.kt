package abstractandinterface

fun main() {

    val interfaceTest = InterfaceChild()
    println("$interfaceTest.name")
    interfaceTest.printScreen()
    interfaceTest.doSomething()

}

/**
 * 여러개의 인터페이스 상속 가능
 * 만일 인터페이스들이 동일한 이름의 함수를 갖고 있다면 이름을 따로 지정해 주어야 함.\
 * 혹은 super<> 통해서 호출이 가능함.
 * 이름이 같지 않을 경우 super.method() 처럼 호출 가능
 */
class InterfaceChild () : InterfaceStudy, InterfaceStudy2 {
    override var name: String = "taekwon"

    override fun doSomething() {
        println("this is override fun : $name")
    }

    /**
     * 상속받은 인터페이스가 여러개일 경우 동일한 이름의 함수가 존재하면
     * 별도로 override 해서 super<> 타입으로 호출을 해줘야 함.
     */
    override fun printScreen() {
        super<InterfaceStudy>.printScreen()
    }

}