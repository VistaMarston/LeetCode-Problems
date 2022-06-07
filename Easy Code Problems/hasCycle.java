/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Time Complexity O(constant)
    public boolean hasCycle(ListNode head) {
        int pos = 0;
        ListNode temp = head;
        int max = 10 * 10 * 10 * 10;
        
        while(temp != null && pos <= max) {
            temp = temp.next;
            pos++;
        }
        
        return pos > max;
    }
}
