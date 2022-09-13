class Solution(object):
    def buildArray(nums):
        # init empty area
        n = len(nums)
        result = [0] * n

        #iterate through nums and put nums[nums[i]] in result
        for i in range(len(nums)):
            result[i] = nums[nums[i]]
        return result 