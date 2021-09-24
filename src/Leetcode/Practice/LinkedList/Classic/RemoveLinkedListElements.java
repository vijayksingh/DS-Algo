package Leetcode.Practice.LinkedList.Classic;

import Implementation.LinkedList.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode prev = head, front = head.next;
        while(front.next != null) {
            if(front.val == val) {
                // Remove the element;
                prev.next = front.next;

                // As one element is deleted move front one element further
                front = front.next;
            }
            // Check if the front needs to be deleted or not
            if(front.val != val)
                prev = front;


            // We might run in a situation where we delete the last element and front.next will become null
            if(front.next != null) front = front.next;
        }
        // Special case: If last element needs to be deleted
        if(front.val == val) {
            prev.next = null;
        } else {
            prev = front;
        }

        // At last element
        return head;
    }
}
