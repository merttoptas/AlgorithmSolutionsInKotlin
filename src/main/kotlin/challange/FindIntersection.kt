package challange

class FindIntersection {
    /*
    Find Intersection

    Have the function FindIntersection(strArr) read the array of strings stored in strArr which will
     contain 2 elements: the first element will represent a list of comma-separated numbers sorted
     in ascending order, the second element will represent a second list of comma-separated numbers
     (also sorted). Your goal is to return a comma-separated string containing the numbers that occur
      in elements of strArr in sorted order. If there is no intersection, return the string false.

     Examples
    Input: ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]
    Output: 1,4,13
    Input: ["1, 3, 9, 10, 17, 18", "1, 4, 9, 10"]
    Output: 1,9,10
     */

    private fun findIntersection(strArr: Array<String>): String {
        val firstArrayList = strArr[0].split(", ")
        val secondArrayList = strArr[1].split(", ")
        var resultList = ""

        firstArrayList.forEach { safeList ->
            if (secondArrayList.contains(safeList)) {
                resultList = "$resultList$safeList,"
            }
        }
        if (resultList.isNotEmpty()) {
            return resultList.substring(0, resultList.length - 1)
        }

        return false.toString()
    }

    fun main() {
        println("FindIntersection: " + findIntersection(arrayOf("1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17")))
    }
}