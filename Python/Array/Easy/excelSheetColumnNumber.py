# Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

# For example:

# A -> 1
# B -> 2
# C -> 3
# ...
# Z -> 26
# AA -> 27
# AB -> 28 

class Solution(object):
    def titleNumber(self, columnTitle):
        # init ans to 0
        ans = 0

        # loop through the char in columnTitle
        for i in columnTitle:
            ans = ans * 26 + ord(i) - ord('A') + 1
        return ans 