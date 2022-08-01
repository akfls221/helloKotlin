package collections.map

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) { //해당 accountId가 MAP에 존재하면
        println("Updating $accountId...")
        EZPassAccounts[accountId] =
            EZPassAccounts.getValue(accountId) + POINTS_X_PASS // 해당 KEY를 가진 VALUE에 15를 더함.(EX 115)
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass Report: ")
    EZPassReport.forEach{
            (k, v) -> println("ID $k : credit $v")
    }
}

fun main() {

    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}

