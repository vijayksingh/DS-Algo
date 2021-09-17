package Leetcode.Practice.LinkedList;

public class RotateList {
    static ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode traveller = head;

        // Find the length
        while(traveller != null) {
            traveller = traveller.next;
            length++;
        }

        // Normalize the k for the length of the list.
        k = length % k;
        traveller = head;

        // Reach to the split point where the list should end after rotation
        for (int i = 1; i < length - (k+1); i++) {
            traveller = traveller.next;
        }

        // Get the splitPoint for later
        ListNode splitPoint = traveller;

        // Reach the end of the list
        while (traveller.next != null) {
            traveller = traveller.next;
        }

        // Join the end to the head so that rotation can happen
        traveller.next = head;

        // Start the next node as head of rotated list
        head = splitPoint.next;

        // Mark the splitPoint as the end of the rotated list
        splitPoint.next = null;
        return head;


    }
}
