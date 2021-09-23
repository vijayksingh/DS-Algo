package Leetcode.Practice.LinkedList;

public class LinkedList {

    // Define a Structure for Node
    class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }


    int val;
    int size = 0;
    Node head, tail;


    /** Initialize your data structure here. */
    LinkedList(int val) {
        this.val = val;
        this.head = null;
        this.tail = null;
    }


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int i) {
        if(this.size == 0 && this.size < i) return -1;
        else {
            Node temp = head;
            while(i-- > 0) {
                temp = temp.next;
            }
            return temp.val;
        }
    }

    public Node getNode(int index) {
        if(this.size == 0 && this.size < index) return null;
        else {
            Node temp = head;
            while(index-- > 0) {
                temp = temp.next;
            }
            return temp;
        }
    }


    /** Add a node of value val before the first element of the linked list. After the insertion,
     * the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(this.size == 0) {
            addAtHead(val);
        } else {
            Node node = new Node(val);
            this.tail.next = node;
            node.next = null;
            this.tail = node;
        }

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     *  the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(this.size != 0 && this.size > index) {
            Node node = new Node(val);
            Node prev = getNode(index-1);
            node = prev.next;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }

    // TODO : Finish implementing Linked List

}
