package Leetcode.Practice.LinkedList.Classic;

import Implementation.LinkedList.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // Check for empty linked list
        if(head == null) return null;
        if(head.next == null) return head;

        // Initialise previous and next pointer.
        ListNode prev = head, next = head.next;
        while(next.next != null) {
            // Take reference of next element
            ListNode temp = next.next;

            // Move the direction of next node to previous
            next.next = prev;

            // Move previous to next node
            prev = next;

            // Move next to next node
            next = temp;
        }
        // At last node, point the node to second last node
        next.next = prev;

        // Point first node to null
        head.next = null;

        // point head to the last node
        head = next;

        return head;

    }
}
