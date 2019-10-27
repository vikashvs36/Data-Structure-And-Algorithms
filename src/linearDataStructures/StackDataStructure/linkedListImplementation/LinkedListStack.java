package linearDataStructures.StackDataStructure.linkedListImplementation;

import linearDataStructures.StackDataStructure.exceptions.StackException;
import linearDataStructures.StackDataStructure.Stack;

/*
 *   Stack Data Structure
 *   -A linkedList based implementation of a stack.
 *
 *   Stack Operations
 *   1. push(value) - Inserting value into the stack
 *   2. pop() - Delete a value from the Stack
 *   3. display() - Displays the elements of a Stack
 *   4. size() - Displays the length of the array
 *   5. pick() - only pick the last inserted element.
 *   6. isEmpty() - Check array is empty or not
 *   7. isFull() - Check array is full or not
 *
 * */
public class LinkedListStack<T> implements Stack<T> {

    private Node<T> top;

    /*
    * Create a Stack
    * */
    public LinkedListStack() {
        top = null;
    }

    /*
    * Inserts a new item into the stack.
    * */
    @Override
    public void push(T value) throws StackException {
        top = new Node<>(value, top);
    }

    /*
    * Removes and returns the item at the top of this stack.
    * */
    @Override
    public T pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    /*
    * Returns the top item without its removal
    * */
    @Override
    public T peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return top.data;
    }

    /*
    * Check the Stack is empty or not.
    * */
    @Override
    public Boolean isEmpty() {
        return top == null;
    }

    /*
    * Clear all node from stack.
    * */
    @Override
    public void clear() {
        top = null;
    }

    /*
    * size() : length of the Stack.
    * */
    @Override
    public Integer size(){
        Integer length= 0;
        while (top != null) {
            length++;
            top = top.next;
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        Node<T> temp = top;
        while (temp != null) {
            str.append(temp.data+ " ");
            temp = temp.next;
        }
        return str.toString();
    }
}
