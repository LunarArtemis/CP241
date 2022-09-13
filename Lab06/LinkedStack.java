public class LinkedStack implements MyStack {

    private MyNode top;

    public LinkedStack() {
        MyStack();
    }

    @Override
    public void MyStack() {
        top = null;
    }

    @Override
    public void push(Object e) throws Exception {
        MyNode p = new MyNode(e);
        p.setNextNode(top);
        top = p;
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        Object e = top.getData();
        top = top.getNextNode();
        return e;
    }

    @Override
    public Object top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
        top = null;
    }
}