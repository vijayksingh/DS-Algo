package Leetcode.Practice.LinkedList.TwoPointer;

import Implementation.LinkedList.ListNode;

public class IntersectionOfTwoList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int length1 = 0, length2 = 0;
        while(temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;

        int difference = Math.abs(length1-length2);
        if (length1 > length2) {
            while(difference-- > 0) {
                temp1 = temp1.next;
            }
        } else {
            while(difference-- > 0) {
                temp2 = temp2.next;
            }
        }

        while(temp1 != null) {
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}

// OPTIMIZATION: DO IT WITHOUT TAKING A DIFFERENCE