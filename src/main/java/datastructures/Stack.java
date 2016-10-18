package datastructures;

import java.util.EmptyStackException;

/**
 * Created by calvinlowyanming on 10/10/16.
 */
public class Stack<E> {

    private class Element<E> {
        private E data;

        private Element<E> next;

        Element(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Element<E> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E value) {
        Element<E> newTop = new Element<E>(value);
        if (!isEmpty()) {
            newTop.next = top;
        }
        this.top = newTop;
    }

    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Element<E> oldTop = top;
        this.top = top.next;
        return oldTop.data;
    }

    public E peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

}
