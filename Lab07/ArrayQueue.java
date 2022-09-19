public class ArrayQueue implements QueueADT {

    private int total;
    private Object q[];
    int front, rear;

    public ArrayQueue(){
        Queue();
    }

    @Override
    public void Queue() {   
        front = -1;
        rear = -1;
        total = 100;
        q = new Object[total];
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        else {
            rear = (rear + 1) % total;
            q[rear] = e;
            if(front == -1){
                front = 0;
            }
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        else {
            int removeItem = front;
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % total;
            }
            return q[removeItem];
        }
    }

    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
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
        return rear + 1;
    }
}