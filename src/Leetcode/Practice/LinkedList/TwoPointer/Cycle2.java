package Leetcode.Practice.LinkedList.TwoPointer;

import Implementation.LinkedList.ListNode;

public class Cycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                // Ahha Moment: When you found the intersection point reset the slow to head.
                // Now move both pointer one by one only. Wherever they intersect again, that's the beginning
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

// Require Review and reason behind the intuitiveness.
