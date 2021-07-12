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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode sortedList = new ListNode();
		ListNode pointerNode = sortedList;
		boolean add = false;
		ListNode temp1 = l1;
		ListNode temp2 = l2;

		if (temp1 == null) { // List 1 doesn't have any items
			return l2;
		} else if (temp2 == null) { // List 2 doesn't have any items
			return l1;
		}

		// Loop through list 1 and compare to list 2
		while (temp1 != null) {
			int value1 = temp1.val; // Grab the next value
			innerLoop: while (temp2 != null) {
				int value2 = temp2.val;
				if (value2 < value1) {
					if (!add) {
						sortedList.val = value2;
                        add = true;
                    }
					else {
						pointerNode.next = new ListNode(value2, pointerNode.next);
						pointerNode = pointerNode.next;
					}
					temp2 = temp2.next;
				} else
					break innerLoop;
			}
			if (!add) {
				sortedList.val = value1;
				add = true;
			} else {
				pointerNode.next = new ListNode(temp1.val, pointerNode.next);
				pointerNode = pointerNode.next;
			}
			temp1 = temp1.next;
		}
		
		if (temp2 != null)
			pointerNode.next = temp2;

		return sortedList;
	}
    
    
}
