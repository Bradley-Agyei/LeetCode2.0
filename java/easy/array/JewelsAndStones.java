
// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
// Example 2:

// Input: jewels = "z", stones = "ZZ"
// Output: 0

class Solution {
    public int numJewelsInStones(String J, String S) {
            if (J.length()==0 || S.length()==0)
                return 0;
    
            int result = 0;
    
            for (char c : S.toCharArray()) {
                if (J.indexOf(c)!=-1) {
                    result++;
                }
            }
            return result;
        }
    }