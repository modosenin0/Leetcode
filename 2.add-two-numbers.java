/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode pointer = l3;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1;
            int num2;
            
            if (l1 == null) {
                num1 = 0;
            }else{
                num1 = l1.val;
            }
            if (l2 == null) {
                num2 = 0;
            }else{
                num2 = l2.val;
            }

            int result = num1 + num2 + carry;
            carry = result / 10;

            pointer.val = result % 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            if (l1 == null && l2 == null) {
                break;
            }

            pointer.next = new ListNode();
            pointer = pointer.next;
            
        }
        if(carry == 1){
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = carry;
        }

        return l3;
    }
}   

// @lc code=end

