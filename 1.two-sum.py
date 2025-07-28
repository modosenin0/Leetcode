#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = dict()

        for i, num in enumerate(nums):
            diff = target - num 
            if diff not in hm:
                hm[num] = i
            else:
                return [i , hm[diff]]
        
# @lc code=end

