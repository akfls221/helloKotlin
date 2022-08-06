package associageby_groupby

/**
 * groupBy()를 이용하면 List를 Map 형태로 변형시킬 수 있습니다.
 * associate()와는 달리, key가 중복이 되어도 value가 List<T>이므로 전부 저장합니다.
 * 즉 assocaiteBy 와 groupBy의 큰 차이는 value의 반환 타입일 것으로 예상
 */
fun main() {

    val people = listOf(
        Person("엄태권", "서울", "1111-11111"),
        Person("엄태권2", "서울1", "2222-2222"),
        Person("엄태권3", "서울2", "3333-3333"),
        Person("엄태권4", "서울3", "4444-4444"),
        Person("엄태권5", "서울4", "1111-11111")
    )

    val peopleCities = people.groupBy(Person::city, Person::name)
    val cities = people.groupBy{it.city}
    val name = people.groupBy{it.name + 1}

    println(peopleCities)
    println(cities)
    println(name)

}