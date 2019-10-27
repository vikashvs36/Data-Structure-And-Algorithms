package linearDataStructures.StackDataStructure.linkedListImplementation;

public class Node<T> {

    protected T data;
    protected Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
