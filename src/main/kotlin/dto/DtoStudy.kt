package dto

/**
 * constructor 클래스 생성자
 * 주요생성자 라고도 하며, 클래스명 뒤에 위치함.
 * 가시성 제한자나 어노테이션이 없다면 constructor 키워드는 생략 가능
 */
class Person constructor(name: String, age: Int) {
    private var name: String = name
    /**
     * 자바에서는 생성자에서 바로 필드를 초기화할 수 있지만
     * 코틀린은 별도의 생성자 영역이 없어 init 영역에서 초기화 해주어야 함.
     */
    init {
        this.name = name
    }

}

/**
 * 인자 = 변수 생성자(init 생략 가능)
 * 주요 생성자에서는 프로퍼티를 선언 및 초기화를 간소화 할수 있게 해줌.
 * 주요 생성자에서 val로 생성시 읽기전용 이며, var로 선언시 읽기 쓰기가 가능함.
 * 외부에서 받아온 값을 init 초기화 없이 사용 가능.
 */
class Person2 constructor(val name: String, val age: Int){
}

/**
 * 부수 생성자
 * constructor 키워드를 사용하여 부수 생성자 생성가능
 * constructor로 생성한 생성자는 기본생성자가 아니기 때문에 인자 = 변수 생성자 같은 형태로 쓸 수 없음.
 */
class Person3(){
    var name: String = ""
    var age : Int = 0

    //constructor로 생성된 부수 생성자는 '기본생성자'를 상속 받아야함.
    constructor(name: String) : this() {
        this.name = name
    }

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
}

/**
 * 부수 생성자는 기본 생성자를 상속 받기 때문에 기본생성자의 인자들 또한 가지고 있어야 함.
 */
class Person4(test: String){
    var name: String = ""
    var age : Int = 0

    //constructor로 생성된 부수 생성자는 '기본생성자'를 상속 받아야함.
    constructor(name: String, test:String) : this(test) {
        this.name = name
    }

    constructor(name: String, age: Int, test: String) : this(test) {
        this.name = name
        this.age = age
    }
}

/**
 * 기본 생성자가 없는 클래스
 * 기본 생성자로 인자가 없는 클래스의 경우 constructor를 매우 자유롭게 만들 수 있음.
 */
class Person5{
    constructor(name: String){

    }

    constructor(name: String, test: Int){

    }

}
