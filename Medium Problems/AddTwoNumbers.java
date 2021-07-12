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
		int[] sum = sumNumber(l1.val, l2.val, 0);
		ListNode sumList = new ListNode(sum[0]);
		ListNode cursor = sumList;
		l1 = l1.next;
		l2 = l2.next;

		while (l1 != null) { // Ensure through list 1
			if (l2 != null) {
				sum = sumNumber(l1.val, l2.val, sum[1]);
				cursor.next = new ListNode(sum[0], cursor.next);
				l2 = l2.next;
			} else {
                sum = sumNumber(l1.val, 0, sum[1]);
				cursor.next = new ListNode(sum[0], cursor.next);
			}
			l1 = l1.next;
			cursor = cursor.next;
		}

		while (l2 != null) { // Ensure through list 2
			sum = sumNumber(l2.val, 0, sum[1]);
			cursor.next = new ListNode(sum[0], cursor.next);
			l2 = l2.next;
			cursor = cursor.next;
		}
		
		if (sum[1] != 0)
			cursor.next = new ListNode(sum[1], cursor.next);
		return sumList;
	}

	private int[] sumNumber(int num1, int num2, int num3) {
		int sum = (num1 + num2 + num3) % 10;
		int remain = (num1 + num2 + num3) / 10;
		return new int[] { sum, remain };
	}
}
