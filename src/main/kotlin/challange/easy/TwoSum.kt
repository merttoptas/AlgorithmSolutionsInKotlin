package challange.easy

/**
 * Created by mertcantoptas on 27.03.2023
 */

// https://leetcode.com/problems/two-sum/

class TwoSum {
    private fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]

            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }

    fun main() {
        println("TwoSum : " + twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}