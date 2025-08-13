#
# @lc app=leetcode id=5 lang=python3
#
# [5] Longest Palindromic Substring
#
from collections import defaultdict


# @lc code=start
class Solution:
    def longestPalindrome(self, s: str) -> str:
        left, right = 0, len(s) - 1
        longest = 0
        l = []

        while left < right:
            word = s[left:right]

            if word[::-1] == word:
                l.append(word)
                left +=1
            else:
                right -=1
        
        return max(l)

            
        
# @lc code=end

