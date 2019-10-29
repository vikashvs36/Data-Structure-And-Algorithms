package linearDataStructures.queueDataStructures.linkedList_Implementation.single_linkedList;

public class SingleLinkedList<T> implements Queue<T> {

    private Node<T> front, rear;

    @Override
    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (this.rear == null) {
            this.front = this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }

    @Override
    public T dequeue() {
        if (this.front == null) {
            return null;
        }
        T temp = this.front.data;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return temp;
    }

    @Override
    public T peek() {
        return (T) this.front.data;
    }

    @Override
    public Boolean isEmpty() {
        return this.rear == null;
    }

    @Override
    public void clear() {
        this.front = this.rear =null;
    }

    @Override
    public Integer size() {
        Integer count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
