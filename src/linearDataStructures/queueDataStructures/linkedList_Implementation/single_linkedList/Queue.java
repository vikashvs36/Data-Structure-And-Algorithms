package linearDataStructures.queueDataStructures.linkedList_Implementation.single_linkedList;

public interface Queue<T> {

    /*
    * Insert the item.
    * */
    void enqueue(T value);

    /*
    * Delete the item.
    * */
    T dequeue();

    /*
    * Gets the element at the front of the queue without removing it.
    * */
    T peek();

    /*
    * Check Array or list is empty or not.
    * */
    Boolean isEmpty();

    /*
    * Clear the list.
    * */
    void clear();

    /*
    * Get length
    * */
    Integer size();

    /*
    * display the all items from font to rear
    * */
    void display();

}
