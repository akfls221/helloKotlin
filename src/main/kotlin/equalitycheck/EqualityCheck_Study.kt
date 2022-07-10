package equalitycheck

/**
 * 자바의 동등성 체크와 드림.
 * 자바 ==(동등성 체크) 값이 같은지 비교함. 그러나 참조 타입인 경우 == 비교를 할 경우 주소값으로 비교하게 됨.
 * String(원시 타입이 아닌 참조타입) 비교시 String a = "hi" 와 String b = "hi"의 경우 값은 같으나 참조 하는 주소가 다르기 때문에 false 임.
 * 이를 위해 값을 벼교하는 equals를 호출해서 배교해야함. a.equals(b)
 *
 * In Kotlin
 * 코틀린에서도 == 연산자가 기본이나 Java와 차이가 있음.
 * 원시타입(동등성 체크)를 위한 == 의 경우 동일하게 동작하지만, 참조타입의 경우 다르게 동작함.
 * ==의 경우 내부적으로 equals를 호출하며, 따라서 참조타입읜 두 개의 String을 == 비교할 경우 주소 값이 아닌 값(동등성) 비교를 함. > java에선 false, kotlin에선 true
 *!! 참조 타입의 주소 값을 비교 하고 싶다면
 * Java에는 없는 === 연산자를 지원하며, 이는 Java의 주소 값 비교인 ==와 동일함.
 */

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // equals를 호출하여 동등성 체크를 하기 때문에 true
    println(authors === writers) // 참조 타입의 주소값 체크를 하기 때문에 false

}

