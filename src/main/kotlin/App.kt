import dto.TestDto2
import dto.TestDto as TestDto

fun main (args: Array<String>) {
    println("hello Kotlin")
    dtoTest()

}

fun dtoTest() {
    val testDto = TestDto("taekwon", 29)
    val testDto2 = TestDto2("taekwon", 29)
    testDto2.birth = "change Birth"
    println(testDto)
    println(testDto2)
}
