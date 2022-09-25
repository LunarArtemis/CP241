public class ArrayStack implements MyStack {

    private int total;
    private Object s[];
    int top;


    public ArrayStack() {
        total = 100;
        s = new Object[total];
        top = -1;
    }

    @Override
    public void push(Object e) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        top++;
        s[top] = e;
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        Object e = s[top];
        top--;
        return e;
    }

    @Override
    public Object top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return s[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == total - 1;
    }

    @Override
    public void clear() {
        top = -1;
    }
    
}
