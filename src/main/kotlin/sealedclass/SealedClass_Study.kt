package sealedclass

/**
 * sealed class
 * 예를 들어 Color 라는 상위 클래스를 만들고, 동일한 파일에 이 클래스를 상속하는 Red, Bule 라는 클래스를 선언할 경우
 * Sealed Class는 이 두개의 클래스 외에 Color 클래스를 상속 받는 다른 클래스가 없다는 것을 컴파일러에게 알려줌.
 * 즉 when을 사용할 때 else를 사용하지 않는 장점이 있음.
 *
 * [특징]
 * 클래스 앞에 sealed  를 붙여 정의함.
 * Sealed class는 abstract 클래스로, 객체로 생성할 수 없음.
 * Sealed class의 생성자는 private으로 public으로 설정이 불가능함.
 * Sealed class와 그 하위 클래스는 동일한 파일에 정의되어야 함.
 * 하위 클래스는 class, data class, object class로 정의할 수 있음.
 */
fun main() {
    //else 구문이 없어도 됨.
    val color: Color = Blue
    val font = when (color) {
        is Red -> {
            println("빨간색 입니다.")
        }
        is Blue -> {
            println("파란색 입니다.")
        }
        is Green -> {
            println("초록색 입니다.")
        }
    }


}

sealed class Color

object Red : Color()
object Green : Color()
object Blue : Color()

