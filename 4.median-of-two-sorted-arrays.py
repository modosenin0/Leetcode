#
# @lc app=leetcode id=4 lang=python3
#
# [4] Median of Two Sorted Arrays
#

# @lc code=start
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        nums = sorted(nums)
        print(nums)
        if(len(nums)%2==0):
            return (nums[int((len(nums)/2)-1)] + nums[int((len(nums)/2))])/2
        else:
            return nums[int(len(nums)/2 - 0.5)]
# @lc code=end

