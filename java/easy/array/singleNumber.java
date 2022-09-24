/* 
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
*/

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    /*
     * time complexity = o(n), space complexity = o(1)
     */

    /*
     * Explanation
     * take [4,1,2,1,2] as an example
     * 
     * ^ will do addition in bitwise manner.
     * But why do we need result=0? Why not simply result=nums[0] and start
     * iteration from the second? => As I mentioned in the beginning, it is an
     * addition. So, taking 4 and 1, it will give 5. But with result=0 it'll give 4
     * at first,
     * then we add 1 and 2.
     * But then, we find duplicates of 1 and 2 which will be subtracted. Why? ^
     * gives 0 when 2 similar numbers are applied:
     * 8 ^ 8 = 0
     * Okay, let me explain everything in more details.
     * Take binary representation:
     * 0000: 0
     * 0001: 1
     * 0010: 2
     * 0011: 3
     * 0100: 4
     * 0101: 5
     * 0110: 6
     * 0111: 7
     * 1000: 8
     * 1001: 9
     * 1010: 10
     * 
     * So, let's iterate over that array:
     * 
     * 0 ^ 4: we check bit by bit: 0 ^ 0 is 0 and 0 ^ 1 is 1, 1 ^ 1 is 0
     * => we get 0100 from it. To put it simply, 4
     * 
     * 4 ^ 1: 0100 ^ 0001 => 0101 which is 5
     * 
     * 5 ^ 2: 0101 ^ 0010 => 0111 which is 7
     * 
     * 7 ^ 1: 0111 ^ 0001 => 0110 which is 6
     * 
     * 6 ^ 2: 0110 ^ 0010 => 0100 which is 4
     * 
     * And 4 is our answer
     */
}