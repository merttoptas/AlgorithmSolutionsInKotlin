package challange

/*
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
aVeryBigSum has the following parameter(s):
int ar[n]: an array of integers .
Return
long: the sum of all array elements
Input Format
The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.
Output Format
Return the integer sum of the elements in the array.
Constraints
 */

class VeryBigSum {

    /*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

    private fun aVeryBigSum(ar: Array<Long>): Long {
        var totalSum: Long = 0
        ar.forEach {
            totalSum += it
        }
        return totalSum
    }

    fun main() {
        println("VeryBigSum: " + aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))

    }
}