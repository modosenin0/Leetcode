#
# @lc app=leetcode id=49 lang=python3
#
# [49] Group Anagrams
#
from collections import defaultdict

# @lc code=start
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        n_l = defaultdict(list)
        for str in strs:
            string = ''.join(sorted(str))
            if string not in n_l:
                n_l[string].append(str)
                continue
            if string in n_l:
                n_l[string].append(str)
        
        result = list(n_l.values())
            
        return result
        
# @lc code=end

