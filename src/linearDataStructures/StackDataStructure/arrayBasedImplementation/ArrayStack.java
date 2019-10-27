package linearDataStructures.StackDataStructure.arrayBasedImplementation;

/*
*   Stack Data Structure
*   - It's implemented using Array and it implemented in java8 using Generics type. All operations details are given below:
*
*   Stack Operations
*   1. push(value) - Inserting value into the stack
*   2. pop() - Delete a value from the Stack
*   3. peek() - only pick the last inserted element.
*   4. clear() - Clear of the array
*   5. size() - size/length of the array
*   6. isFull() - Check array is full or not
*   7. isEmpty() - Check array is empty or not
*
* */

import linearDataStructures.StackDataStructure.exceptions.StackException;
import linearDataStructures.StackDataStructure.Stack;
import com.sun.istack.internal.NotNull;

public class ArrayStack<T> implements Stack<T> {

    protected final Byte INITIAL_ARRAY_LENGTH = 10;
    protected Object stackArray[];
    protected Integer pointer = -1;

    /*
    * Create a Stack object with default INITIAL_ARRAY_LENGTH
    * */
    public ArrayStack() {
        stackArray = new Object[INITIAL_ARRAY_LENGTH];
    }

    /*
    * Create a Stack Object with custom INITIAL_ARRAY_LENGTH.
    * */
    public ArrayStack(@NotNull Integer size) {
        if (size == null || size <= 0) {
            throw new StackException("Not a Valid INITIAL_ARRAY_LENGTH");
        }
        stackArray = new Object[size];
    }

    /*
    * push() - insert the element in the Stack.
    * */
    @Override
    public void push(T value) {
        if (isFull()) { throw new StackException("Error : Exceeded Array length, Total length : "+size()); }
        stackArray[++pointer] = value;
    }

    /*
    * pop() - remove element from top in the Stack.
    * */
    @Override
    public T pop() {
        if (isEmpty()) throw new StackException("Error : No value in Array");
        return (T) stackArray[pointer--];
    }

    /*
    * peek() : peek the last inserted element from Stack.
    * */
    @Override
    public T peek() {
        if (isEmpty()) throw new StackException("Error : No value in Array");
        return (T) stackArray[pointer];
    }

    /*
    * clear() : clear all element from Stack
    * */
    @Override
    public void clear() {
        pointer = -1;
    }

    /*
     * size() - Displays the length of the array
     * */
    @Override
    public Integer size() {
        return pointer+1;
    }

    /*
     * isFull() - Check array is full or not
     * */
    public boolean isFull() {
        if (pointer >= stackArray.length-1) return true;
        return false;
    }

    /*
     * isEmpty() - Check array is empty or not
     * */
    public Boolean isEmpty() {
        if (pointer < 0) return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=pointer; i++) {
            sb.append(stackArray[i]+" ");
        }
        return sb.toString();
    }

}
