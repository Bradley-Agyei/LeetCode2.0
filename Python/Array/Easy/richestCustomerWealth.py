class Solution(object):
    def customerWealth(self, accounts):
        # init maxWealth, currWealth 
        maxWealth, currWealth = 0, 0

        # loop through the customers in accounts and return sum 
        for customers in accounts:
            currWealth = sum(customers)

            # make comparison between maxWealth and currWealth
            if maxWealth < currWealth:
                maxWealth = currWealth
                
        return maxWealth