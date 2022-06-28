package out

import java.util.Arrays


fun main() {

    /**
     * 제네릭
     * <> 형태를 가지고 있음, 코드를 재사용 하고 싶을 때 여러 타입을 지원하기 위한 기능임.
     */
    fun <T> wrap(value: T){
        println(value)
    }
    wrap(1)
    wrap("this is Generic")

    /**
     * 불변성
     * 코틀린에서의 제네렉은 자바와 마찬가지로 '타입 불변성'을 가짐.
     * 타입 불변성 : 제네릭 타입을 사용하는 클래스, 인터페이스에는 해당 타입의 자식이나 부모를 대입할 수 없고 오직 일치하는 타입만 대입이 가능함.
     */
    open class Animal
    class Cat : Animal()
    class Dog : Animal()

    //일반 상속 관계 > 부모에 자식을 사용 할 수 있다.
    val animal : Animal = Cat()

    //불변성에 의한 에러
    // 이유 : Array<T> 즉 제네릭 타입으로 타입이 ㅈ정확히 일치해야 한다.(상속관계와 상관이 없음)
    // 즉 A가 B를 상속받아도 Class<A>는 Class<B>를 상속받지 않는다.
    val cats : Array<Cat> = arrayOf(Cat(), Cat())
    //val animals : Array<Animal> = cats

    //대입가능한 경우
    // 이유 : List<out E> 로 out 덕분에 공변성으로의 변환이 가능함.
    val cats2: List<Cat> = listOf(Cat(), Cat())
    val animals : List<Animal> = cats2

    /**
     * 공변성
     * 즉 위의 불변성 해결을 위해선 Class<A> 가 Class<B>를 상속받는다로 바꾸어 줘야함.
     * 이를 가능하게 하는 키워드가 바로 out 임.
     * 즉 이에 A는 B를 상속받으면서 Class<A> 가 Class<B>를 상속받게 되는 것임.
     * 공변성을 가지게 되면, out 키워드를 넣어준 파라미터 타입은 Nothing 타입을 write 해주길 바람. 그 이유는 공변성을 가지게 되면 read만 가능하고 write가 불가능 해지기 때문임.
     * 이를 반대로 wirte는 가능 read는 불가능하게 하는 것을 in으로 사용함.
     */
    // 위 예제 Array<T> 를 Array<out T>를 사용하여 공변성을 적용해봄
    //
    fun copyDogToAnimal(dogs: Array<out Animal>, animals: Array<Animal>) {
        for(i in animals.indices){
            dogs[i] = animals[i] as Nothing
        }

    }
}