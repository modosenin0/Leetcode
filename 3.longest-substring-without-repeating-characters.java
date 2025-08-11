/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
import java.util.HashMap;

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  longest = 0;
        int  left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() == 1){
            return 1;
        }
        
        for (int right = 0; right < s.length(); right++) {
            char letter = s.charAt(right);
            if (map.containsKey(letter)) {
                left = Math.max(left, map.get(letter)  + 1);
            }
            map.put(letter, right);
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
        
    }
}
// @lc code=end

