package Implementation.Stack;

import java.util.ArrayList;

public class Stack<E> {
    ArrayList<E> arr = new ArrayList<>();
    int top = -1;

    void push (E x) {
        top += 1;
        arr.add(top, x);
    };

    void pop() {
        if(!isEmpty()) {
            top -= 1;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    };

    boolean isEmpty() {
        return top == -1;
    };

    int size() {
        return top+1;
    }

    E peek() {
        return arr.get(top);
    }
}
