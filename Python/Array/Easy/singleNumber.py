# Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

# You must implement a solution with a linear runtime complexity and use only constant extra space.

class solution(object):
    def singleNumber(self, nums):
        result = 0

        # loop through array and use XOR to add/substract bits 
        for num in nums:
            result ^= num
        return result 

        # 0010 + 0110 = 0100

# time comp: O(N)
# space comp: O(1)