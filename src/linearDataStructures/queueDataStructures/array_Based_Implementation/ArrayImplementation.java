package linearDataStructures.queueDataStructures.array_Based_Implementation;

public class ArrayImplementation<T> implements Queue<T> {

    private Integer front = 0;
    private Integer rear = 0;
    private T[] queues;
    private final Integer INITIAL_ARRAY_LENGTH = 5;

    ArrayImplementation() {
        queues = (T[])new Object[INITIAL_ARRAY_LENGTH];
    }

    ArrayImplementation(Integer size) {
        queues = (T[]) new Object[size];
    }

    @Override
    public void enqueue(T value) throws Exception {
        if (!isfull()) queues[rear++] = value;
        else throw new Exception("Array is full.");
    }

    @Override
    public T dequeue() throws Exception {

        if (!isEmpty()) {
            T temp = queues[front];
            for (int i = 0; i < rear - 1; i++) {
                queues[i] = queues[i + 1];
            }
            --rear;
            return temp;
        }
        else throw new Exception("Array is empty.");
    }

    @Override
    public T peek() throws Exception {
        if (!isEmpty()) return (T) queues[front];
        else throw new Exception("Array is empty");
    }

    @Override
    public Boolean isEmpty() {
        return front == rear;
    }

    @Override
    public Boolean isfull() {
        return rear == queues.length;
    }

    @Override
    public void clear() {
        rear = 0;
    }

    @Override
    public Integer size() {
        return rear;
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            for (int i = front; i < rear; i++) {
                System.out.print(queues[i] + " ");
            }
        }
        else {
            System.out.println("Sorry, There is not items.");
        }
    }
}
