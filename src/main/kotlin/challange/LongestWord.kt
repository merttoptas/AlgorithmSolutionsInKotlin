package challange

class LongestWord {

    /*
    Longest Word
    Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
    If there are two or more words that are the same length, return the first word from the string with that length.
    Ignore punctuation and assume sen will not be empty.
    Examples
    Input: "fun&!! time"
    Output: time
    Input: "I love dogs"
    Output: love
    Input: "a beautiful sentence^&!"
    Output: beautiful
    Input: "a confusing /:sentence:/[ this is not!!!!!!!~"
    Output: confusing
     */

    private fun longestWord(sen: String): String {

        val letterList = arrayListOf<String>()
        var longestWord = sen

        val isLongestStr = sen.split(" ")
        val strRange = ('a'..'z') + ('A'..'Z') + ('0'..'9')

        isLongestStr.forEach { safeStr -> letterList.add(safeStr.filter { it in strRange }) }
        longestWord = letterList.maxByOrNull { it.length } ?: ""

        return longestWord
    }

    fun main() {
        println("Longest Word: " + longestWord("I love dogs fun&!!"))
    }
}