using System.Collections.Generic; 

public class Solution {
    public ListNode DeleteDuplicates(ListNode head) {
        HashSet<int> duplicates = new HashSet<int>(); // Create a way of checking duplicates
            ListNode pointer = head; // Create a pointer to the head node

            if (head != null)
            {
                duplicates.Add(pointer.val);

                while (pointer.next != null)
                {
                    int value = pointer.next.val;
                    if (duplicates.Contains(value))
                        pointer.next = pointer.next.next;
                    else
                    {
                        duplicates.Add(value);
                        pointer = pointer.next;
                    }
                }
            }

            return head;
    }
}
