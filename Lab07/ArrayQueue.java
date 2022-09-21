public class ArrayQueue implements QueueADT {
    private int total;
    private Object q[];
    int front, rear;

    public ArrayQueue() {
        Queue();
    }

    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        total = 3;
        q = new Object[total];
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        } else {
            rear++;
            q[rear] = e;
        }
    }

    // remove the first node from the queue
    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            front = front + 1;
            return q[front];
        }
    }

    // return the first node from the queue
    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            return q[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

    @Override
    public boolean isFull() {
        return rear == total;
    }

    @Override
    public void clear() {
        front = rear = -1;
    }

    @Override
    public int length() {
        return rear - front;
    }
}