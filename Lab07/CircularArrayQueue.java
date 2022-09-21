public class CircularArrayQueue implements QueueADT {

    private int total;
    private Object q[];
    int front, rear;

    public CircularArrayQueue() {
        Queue();
    }

    // create a new queue
    @Override
    public void Queue() {
        front = -1;
        rear = -1;
        total = 100;
        q = new Object[total];
    }

    // create a new queue with a specified size
    @Override
    public void enqueue(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        } else {
            rear = (rear + 1) % total;
            q[rear] = e;
            if (front == -1) {
                front = 0;
            }
        }
    }

    // remove the first node from the queue
    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            int removeItem = front;
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % total;
            }
            return q[removeItem];
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
        return front == (rear + 1) % total;
    }

    @Override
    public void clear() {
        front = rear = -1;
    }

    @Override
    public int length() {
        if(isEmpty()){
            return 0;
        }
        else{
            return (total - front + rear + 1) % total;
        }
    }
}