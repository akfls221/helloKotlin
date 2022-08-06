package partition

/**
 * partition 함수를 사용하면 리스트를 특정 조건에 따라 분리 가능함.
 * List or Set에서 사용할 수 있으며, Map에서는 불가능함.
 * 반환된 타입은 Pair<List<Int>, List<Int>> 으로서 first와 second로 각 리스트에 접근할 수 있다.
 *
 * @@반환은 모두 List로 해줌
 * first : 조건에 만족하는 원소들로 구성된 리스트
 * second : 조건에 만족하지 않는 원소들로 구성된 리스트
 *
 * 본래 partition으로 얻을수 있는 결과물은
 * 저정할 콜렉션(리스트) 선언 + for문 if문 + 삽입연산과 같은 복잡한 작업을 해주어야함.
 */
fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    //이런 경우 evenOdd.first - 참, evenOdd.second - 거짓 으로 사용 가능
    val evenOdd = numbers.partition { it + 1 == 4 }
    
    //아래와 같이 1허용값, 2비허용값을 변수로 주어 사용 가능
    val (positive, negatives) = numbers.partition { it + 1 == 4 }

    println("맞지 않는 리스트 : ${evenOdd.second}")
    println("맞는 리스트 : ${evenOdd.first}")
    println("맞는 리스트 : $positive")
    println("맞지 않는 리스트 : $negatives")

}

