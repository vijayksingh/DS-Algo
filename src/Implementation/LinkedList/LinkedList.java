package Implementation.LinkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {

    // Two variables to hold data and next pointer
    T data;
    ListNode<T> node; // This would be the head of our linked list

    public LinkedList(T data, ListNode<T> node) {
        this.data = data;
        this.node = node;
    }

    // Clear the linked list, O(n)
    public void clear() {

    }

    // Get the size
    public int size() {
        return 0;
    }

    // add to the linked list()
    public void add() {

    }

    // add to the head
    public void push() {

    }

    // add to the last
    public void addLast() {

    }

    // PeekFirst Method

    // PeekLast Method

    // removeFirst Method

    // removeLast Method

    // remove a given Node
    public T remove(ListNode<T> node) {
        return node.data;
    }

    // remove at particular index
    public T removeAt(int index) {
        return node.data;
    }


    // TODO : Complete this linked list implementation

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
