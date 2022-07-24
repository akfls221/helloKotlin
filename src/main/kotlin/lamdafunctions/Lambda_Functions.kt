package lamdafunctions

fun main() {

    /**
     * 참고 : https://ddolcat.tistory.com/557
     * val lambda // 변수를 합수처럼 사용 가능
     * val lambda: (String) -> String //(String) -> String : 람다식의 선언 자료형 > @람다식 매개변수에 자료형이 명시된 경우 생략 가능
     * val lambda: (String) -> String = {x: String -> x.uppercase()} // x: String : 람다식의 미개변수 > @선언 자료형이 명시되어 있으면 생략 가능
     * x.uppercase() // 람다식의 처리 내용
     * 
     */

    //Full Ver
    val upperCase1: (String) -> String = {str : String -> str.uppercase()}

    //매개변수 타입 생략
    val upperCase2: (String) -> String = { str -> str.uppercase() }

    //선언 자료형 생략
    val upperCase3 = {str: String -> str.uppercase()}

    //error 추론 불가
    // val upperCase4 = { str -> str.uppercase() }

    //it 을 사용한 람다식
    val upperCase5: (String) -> String = {it.uppercase()}

    //최종 간단하게
    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))


}
