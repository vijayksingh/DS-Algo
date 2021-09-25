package Leetcode.Practice.LinkedList;

import Implementation.LinkedList.ListNode;

public class MergeTwoSortedList {
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }

        if(l1 == null) {
            handler.next = l2;
        } else if (l2 == null) {
            handler.next = l1;
        }

        return head.next;
    }

    public static void main(String[] args) {

    }

}
