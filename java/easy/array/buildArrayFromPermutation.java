/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
*/

/*
naive solution
*/
class Solution {
    public int[] buildArray(int[] nums) {
        
        int[]ans = new int[nums.length];

        for(int item : nums) {
            
            ans[item] = nums[nums[item]];
        }

        return ans;
    }
}

/*
time complexity = o(n), space complexity = o(n)
*/

/*
Explanation for O(1) space complexity

Lets first see generally what should be done.

1. We need to store 2 values in one place, so we will use math (quotient and remainder)

2. Let, size of array = n
original number = a
final number = b

3. So we will store a = a + n*b

4. On taking a%n, we will get a
On doing a/n, we will get b

5. Here the b that we are using is actually an a and there is a chance that it might be an a that is updated (final number)
To get a from a, we use a%n
So, here it will be b%n

6. Finally, our equation becomes a=a +n(b%n)

7. In the question a=nums[i] and b=nums[nums[i]]

8. So finally, the equation becomes
nums[i] = nums[i] + n * (nums[nums[i]]%n)
*/

class Solution {
public int[]buildArray(int[]nums) {


        int numsLength = nums.length;

        for (int item = 0; item < numsLength; item++){

            nums[item] = nums[item] + numsLength * (nums[nums[item]] % numsLength);

        }

        for (int item = 0; item < numsLength; item++) {
            nums[item] /= numsLength;
        }

        return nums;
    }
};

/*
time complexity = o(n), space complexity = o(1)
*/
