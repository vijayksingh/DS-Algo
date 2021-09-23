package Leetcode.Practice.LinkedList.TwoPointer;

import Implementation.LinkedList.ListNode;

public class Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null) {
            // In case fast.next is null may lead to null pointer exception in next line
            if (fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
