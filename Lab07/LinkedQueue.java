public class LinkedQueue implements QueueADT {

    Object e;
    MyNode head,tail;
    int size;

    public LinkedQueue() {
        Queue();
    }

    @Override
    public void Queue() {
        head = tail = null;
    }

    @Override
    public void enqueue(Object e) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        else {
            MyNode node = new MyNode(e);
            if(isEmpty()){
                head = tail = node;
            }
            else {
                tail.setNextNode(node);
                tail = node;
                size++;
            }
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        else {
            Object removeItem = head.getData();
            if(head == tail){
                head = tail = null;
            }
            else {
                head = head.getNextNode();
            }
            size--;
            return removeItem;
        }
    }

    @Override
    public Object front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            return head.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null || tail == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }

}
