package enum

fun main() {

    val message = when (State.RUNNING) {
        State.IDLE -> "it is idle"
        State.RUNNING -> "it is running"
        State.FINISHED -> "it is finished"
    }
    println(message) //it is running 출력

    println(Color.BLUE.rgbList())
    Color.values().forEach { it -> println(it.colorName) }




}

enum class State{
    IDLE, RUNNING, FINISHED
}

enum class Color(
    val rgb: Int,
    val colorName: String
){
    RED(0xFF0000, "빨강"),
    GREEN(0x00FF00, "초록"),
    BLUE(0x0000FF, "파랑"),
    YELLOW(0xFFFF00, "노랑");

    fun rgbList(): List<Color> {
        return listOf(
            RED,
            GREEN,
            BLUE
        )
    }
}
