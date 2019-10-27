package linearDataStructures.StackDataStructure;

import linearDataStructures.StackDataStructure.exceptions.StackException;

public interface Stack<T> {

    /*
    * Inserts an item onto the top of the stack.
    * */
    void push(T value) throws StackException;

    /*
    * Removes and returns the item at the top of this stack.
    * */
    T pop() throws StackException;

    /*
    * Returns the top item without its removal
    * */
    T peek() throws StackException;

    /*
    * Check Stack is empty or not.
    * */
    Boolean isEmpty();

    /*
    * Remove all items.
    * */
    void clear();

    /*
    * length of the Stack.
    * */
    default public Integer size() {
        return 0;
    }

}
