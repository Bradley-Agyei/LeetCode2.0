/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        /*
        setting variables
        */
        int rowLength = accounts.length;
        int columnLength = accounts[0].length;
        int maxWealth = 0;
        int currentWealth = 0;
        
        /* 
        iterating through customer bank accounts and adding 
        up each customers money from each of their banks
         */     
        for (int row = 0; row < rowLength; row++) {
             currentWealth = 0;
            for (int column = 0; column < columnLength; column++) {
                currentWealth += accounts[row][column];
            }
            
            maxWealth = (currentWealth > maxWealth) ? currentWealth : maxWealth;
        }
        
        return maxWealth;
    }
    /*
    time complexity = o(n), space complexity = o(1)
    */
}
