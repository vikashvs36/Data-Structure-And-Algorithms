package linearDataStructures.queueDataStructures.linkedList_Implementation.single_linkedList;

public class Node<T> {

    protected T data;
    protected Node<T> next;

    public Node() {}

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
