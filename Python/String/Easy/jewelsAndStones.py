# You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
# Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

# Letters are case sensitive, so "a" is considered a different type of stone from "A".

class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        counter = 0
        jewels = set(jewels)
        for stone in stones:
            if jewels in stone:
                counter += 1
        return counter 
