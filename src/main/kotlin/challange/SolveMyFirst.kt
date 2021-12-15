package challange

/*
Complete the function solveMeFirst to compute the sum of two integers.

Example


Return .

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of  and

Constraints


Sample Input

a = 2
b = 3
Sample Output

5
 */

class SolveMyFirst {
    private fun solveMeFirst(a: Int, b: Int): Int {
        return a + b
    }

    fun main() {
        println("Solve Me First: " + solveMeFirst(2, 3))
    }
}