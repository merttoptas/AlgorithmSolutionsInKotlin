package challange

/*
* There is a large pile of socks that must be paired by color. Given an array of integers
* representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3
 */


class SalesMyMatch {
    private fun sockMerchant(n: Int, ar: Array<Int>): Int {
        var result: Int = 0
        val colorList = mutableListOf<List<Int>>()

        if (n == ar.size) {
            // equal value add to list
            ar.forEachIndexed { index, arItem ->
                if (index == 0) {
                    colorList.add(listOf(arItem))
                } else {
                    var isExist = false
                    colorList.forEachIndexed { colorIndex, colorItem ->
                        if (colorItem.contains(arItem)) {
                            isExist = true
                            colorList[colorIndex] = colorItem + arItem
                        }
                    }
                    if (!isExist) {
                        colorList.add(listOf(arItem))
                    }
                }
            }

            var count = 0
            colorList.forEach {
                if (it.size > 1) {
                    count += it.size / 2
                }
            }
            result = count

        }
        return result
    }

    fun main() {
        println("Sales My Match: " + sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)))
    }
}