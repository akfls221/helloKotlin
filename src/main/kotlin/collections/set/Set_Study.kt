package collections.set

fun main() {

    val aNewIssue: String = "test4"
    val duplicateIssue: String = "test2"

    println(addIssue(aNewIssue)) //true return
    println(addIssue(duplicateIssue)) // false return
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $duplicateIssue ${getStatusLog(addIssue(duplicateIssue))}")

}

val openIssues: MutableSet<String> = mutableSetOf("test1", "test2", "test3")

fun addIssue(newIssue: String): Boolean {
    return openIssues.add(newIssue)
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) "registers correctly." else "it is duplicate and rejected"
}