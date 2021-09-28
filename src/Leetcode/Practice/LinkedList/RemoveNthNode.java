package Leetcode.Practice.LinkedList;

import Implementation.LinkedList.ListNode;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0, pos = n;
        ListNode temp = head;

        // Count the length
        while(temp != null) {
            length++;
            temp = temp.next;
        }

        // Reset the head
        temp = head;
        // Normalise n with respect to length. if length is 5 and n = 2 remove (5-2)->next element
        pos = length - n;

        // Making the node stop 1 place before target node
        while(pos-- > 1) {
            temp = temp.next;
        }

        // Special case for list of length 1
        if (n == length && n == 1) head = null;

            // If we have to remove the last node
        else if(n == 1) temp.next = null;

            // if we have to remove the first node
        else if (n == length) head = head.next;

            // if we have to remove anything in between
        else temp.next = temp.next.next;

        return head;
    }
}
