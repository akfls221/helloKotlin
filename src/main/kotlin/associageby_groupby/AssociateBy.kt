package associageby_groupby

/**
 * associate()를 이용하면 List를 Map 형태로 변형시킬 수 있음.
 * 다만 key가 중복되면 마지막 요소를 Map의 Value로 저장함.
 * @예시
 * associateBy {it.phone} : it.phone을 key로 Phone을 Value 로 Map을 만듦.
 * associateBy {Person::name, Person::phone} : Person의 name을 key로, Person의 phone을 Value로 Map형식을 만듦.
 *
 */
fun main() {

    val people = listOf(
        Person("엄태권", "서울", "1111-11111"),
        Person("엄태권2", "서울1", "2222-2222"),
        Person("엄태권3", "서울2", "3333-3333"),
        Person("엄태권4", "서울3", "4444-4444"),
        Person("엄태권5", "서울4", "1111-11111")
    )

    val phoneBook = people.associateBy { it.phone }
    val cityPhone = people.associateBy (Person::city, Person::phone)

    println(phoneBook)
    println(cityPhone)

}
