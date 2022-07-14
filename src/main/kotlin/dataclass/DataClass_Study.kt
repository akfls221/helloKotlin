package dataclass

/**
 * data class란?
 * 데이터 보관을 목적으로 사용하는 클래스
 * 프로퍼티에 대한 getter(), setter(), equals(), hashCode(), toString(), copy(), component() 메소드를 컴파일 시점에 자동으로 생성한다.(Lombok의 역할)
 * class 앞에 data를 붙여 정의함.
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


}

data class User(val name: String, val int: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (int != other.int) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + int
        return result
    }

    override fun toString(): String {
        return "User(name='$name', int=$int)"
    }


}


