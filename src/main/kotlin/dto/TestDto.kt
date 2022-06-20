package dto

class TestDto constructor (val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TestDto

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun toString(): String {
        return "TestDto(name='$name', age=$age)"
    }
}
