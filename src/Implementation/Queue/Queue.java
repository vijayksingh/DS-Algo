package Implementation.Queue;

import java.util.ArrayList;

public class Queue<E> {
    private int max = 100;
    ArrayList arr = new ArrayList<E>();
    private int front = 0, size = 0, end = 0;

    public void enqueue(E x) {
        if(isFull()) {
            throw new RuntimeException("Queue is full");
        } else {
            arr.add(front, x);
            front = (front+1) % max;
            size++;
        }
    }

    public void dequeue() {
        if(isEmpty())
            throw new RuntimeException("Queue is Empty");
        else {
            end = (end+1) % max;
            size--;
        }
    }

    public E peek() {
        if(isEmpty()) throw new RuntimeException("Queue is Empty");
        return (E) arr.get(end);
    }

    int size() {
        return size;
    }

    boolean isFull() {
        return size() == max;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        for(int i = 0; i < 50; i++) {
            queue.enqueue((int) (Math.random() * 100));
        }
        for(int i = 0; i < 50; i++) {
            System.out.println(queue.peek());
            queue.dequeue();
        }


        // Check whether the queue can hold more than 100 values.
        for(int i = 0; i < 60; i++) {
            queue.enqueue((int) (Math.random() * 100));
        }
        for(int i = 0; i < 60; i++) {
            System.out.println(queue.peek());
            System.out.println(queue.size());
            queue.dequeue();
        }

    }
}
