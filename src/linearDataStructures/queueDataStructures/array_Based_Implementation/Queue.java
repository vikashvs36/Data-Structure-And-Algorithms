package linearDataStructures.queueDataStructures.array_Based_Implementation;

public interface Queue<T> {

    /*
    * Insert the item.
    * */
    void enqueue(T value) throws Exception;

    /*
    * Delete the item.
    * */
    T dequeue() throws Exception;

    /*
    * Gets the element at the front of the queue without removing it.
    * */
    T peek() throws Exception;

    /*
    * Check Array or list is empty or not.
    * */
    Boolean isEmpty();

    /*
    * Checks if the queue is full.
    * */
    Boolean isfull();

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
