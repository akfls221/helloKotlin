package dataclass

/**
 * data class란?
 * 데이터 보관을 목적으로 사용하는 클래스
 * 프로퍼티에 대한 getter(), setter(), equals(), hashCode(), toString(), copy(), component() 메소드를 컴파일 시점에 자동으로 생성한다.(Lombok의 역할)
 * class 앞에 data를 붙여 정의함.
 *
 * @@추가 : 프로퍼티를 val로 줄 경우 setter는 생성되지 않고 getter만 생성됨.  > 프로퍼티 값을 수정하려 하면 에러가 발생함.
 */
fun main() {
    val user = User("taekown", 29)
    println("USER 출력(toString) : $user")

    val equalUser1 = User("user1", 11)
    val equalUser2 = User("user2", 22)
    val equalUser3 = User("user1", 11)

    println("this is false(==의 경우 코틀린에선 .equal()과 같음) ${equalUser1 == equalUser2}")
    println("this is false(===의 경우 코틀린에선 참조값 비교와 같음) ${equalUser1 === equalUser2}")
    println("this is false(===의 경우 코틀린에선 참조값 비교와 같음) ${equalUser1 === equalUser3}")
    println("this is true(===의 경우 코틀린에선 참조값 비교와 같음) ${equalUser1 == equalUser3}")

    println("this is hashCode : ${equalUser1.hashCode()}")

    /**
     * copy 함수
     * 코틀린 커파일러의 경우 data class의 인스턴스를 더 쉽게 불변 객체로 활용할 수 있게 메소드로 제공함.
     * copy()함수는 객체를 복사하면서 일부 프로퍼티를 바꿀 수 있게 해줌.
     * @참조 : 복사본의 경우 원본과 다른 생명주기를 가지며, 복사본의 프로퍼티 값을 바꾸거나 제거해도 프로그램에서 원본을 참조하는 다른부분에 영향을 주지않기 때문에 권장함.
     */
    val copyUser = equalUser1.copy(age = 1000)
    println("this is copyUser Age : $copyUser.age")

}

data class User(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "User(name='$name', int=$age)"
    }


}


