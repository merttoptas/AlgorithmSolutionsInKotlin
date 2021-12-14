package challange

class QuestionsMarks {
    /*
    Questions Marks
    Have the function QuestionsMarks(str) take the str string parameter, which will contain single
    digit numbers, letters, and question marks, and check if there are exactly 3 question marks
    between every pair of two numbers that add up to 10. If so, then your program should return
    the string true, otherwise it should return the string false. If there aren't any two numbers
    that add up to 10 in the string, then your program should return false as well.
    For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because
    there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at
    the end of the string.
    Examples
    Input: "aa6?9"
    Output: false
    Input: "acc?7??sss?3rr1??????5"
    Output: true
     */

    private fun questionsMarks(str: String): String {
        var questionMarksCount = 0
        var lastDigit = -1
        var results = "false"

        for (i in str) {
            if (i.isDigit()) {
                val digit = i.toString().toIntOrNull()
                if (digit != null) {
                    val sum = digit + lastDigit
                    lastDigit = digit

                    if (sum != 10) {
                        questionMarksCount = 0
                        continue
                    }
                    results = if (questionMarksCount == 3)
                        "true"
                    else
                        "false"
                    questionMarksCount = 0
                }
            } else if (i.toString() == "?") questionMarksCount++
        }

        return results
    }

    fun main() {
        println("QuestionsMarks: " + questionsMarks("acc?7??sss?3rr1??????5"))
    }
}