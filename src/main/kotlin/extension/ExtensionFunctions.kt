package extension

/**
 * 확장 함수
 * 클래스를 확장하면서 만든 새로운 함수를 의미
 * fun String(receiver Type).lastChar() : Char = this(receiver Object).get(this(receiver Object).length - 1)
 * receiver Type : 확장 함수를 추가할 클래스를 말함.(확장 대상이 될 클래스)
 * receiver Object : 확장 함수 내부를 구현할 때 this로 receiver type이 가지고 있는 public 인스턴스테 접근 가능. 이렇게 접근한 객체를 receiver object 라고 함.
 * @@@@@ 기본 구조 : fun <class_name>.<method_name>()
 * 즉 Class를 확장한다고 생각하면 될듯.
 *
 */
fun main() {

    val testArray : List<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        testArray.ExtensionFunctions(5)
}

// List class 를 확장 받아 구현한 function
fun List<Int>.ExtensionFunctions(number : Int) {

    val name: String = "Owen"
    val age: Int = 29
    val address: String = "서울시"

    //여기서 this는 testArray를 의미함. 즉 확장된 클래스 로 작성한 receiver Object
    for (i in this) {
        if(i < number) {
            println("$address 사시는 $name $age 살님 안녕하세요 숫자는 : $i 입니다.")
        }
    }
}