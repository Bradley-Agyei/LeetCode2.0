# Given an integer numRows, return the first numRows of Pascal's triangle.

# In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
# rType = [[]]
class Solution(object):
    def pascalsTriangle(self, numRows):
        # init first triangle to [1]
        triangle = [[1]]

        # loop through to create numRows
        for j in range(1, numRows):
            # grab the previous row to create next row
            previous_row = triangle[-1]

            # perform math to create new row 
            triangle.append([1] + [previous_row[i] + previous_row[i+1] for i in range(len(previous_row) - 1)] + [1])

        return triangle 

            



