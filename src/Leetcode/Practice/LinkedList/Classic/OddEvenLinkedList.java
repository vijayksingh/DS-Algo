package Leetcode.Practice.LinkedList.Classic;

import Implementation.LinkedList.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        // Intialise pointers at even and odd positions
        ListNode odd = head, even = head.next, evenHead = even;


        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;

    }
}
