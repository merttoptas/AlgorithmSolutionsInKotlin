package challange

class UsernameValidation {
    /*
    Codeland Username Validation
    Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:
    1. The username is between 4 and 25 characters.
    2. It must start with a letter.
    3. It can only contain letters, numbers, and the underscore character.
    4. It cannot end with an underscore character.
    If the username is valid then your program should return the string true, otherwise return the string false.
    Examples
    Input: "aa_"
    Output: false
    Input: "u__hello_world123"
    Output: true
     */


    private fun codeLandUsernameValidation(str: String): Boolean {
        var isValidationValue = false
        val isItRange = str.trim().length in 5..25
        val isUnderScore = str.last().toString() == "_"

        val firstRange = ('a'..'z') + ('A'..'Z')
        val isFirstLatter = str.first().toString().filter { it in firstRange } == str.first().toString()

        if (isItRange && isLetters(str) && !isUnderScore && isFirstLatter) {
            isValidationValue = true
        }

        return isValidationValue
    }

    private fun isLetters(str: String): Boolean {
        var isLetters = false

        val ranges = ('0'..'9') + ('a'..'z') + ('A'..'Z') + ('_')
        val escaped = str.filter { it in ranges }

        if (escaped == str) {
            isLetters = true
        }

        return isLetters
    }

    fun main() {
        println("UsernameValidation: " + codeLandUsernameValidation("u__hello_world123"))
    }
}
