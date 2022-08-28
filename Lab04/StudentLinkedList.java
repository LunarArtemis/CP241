public class StudentLinkedList implements StudentADT {
    MyNode firstNode;
    MyNode lastNode;
    MyNode currentNode, p;
    int totalStd;
    Stat statADT;

    StudentLinkedList() {
        firstNode = lastNode = currentNode = null;
        totalStd = 0;
    }

    @Override
    public Student getCurrentStudent() {
        MyNode outputNode = currentNode;
        currentNode = currentNode.getNextNode();
        return outputNode.getData();
    }

    @Override
    public void setCurrentStudent(Student std) {
        totalStd++;
        if (empty()) {
            statADT = new Stat();
            lastNode = new MyNode(std);
            firstNode = lastNode;
            currentNode = firstNode;
            statADT.setData(currentNode.getData().getTotalScore());
        } else {
            lastNode.setNextNode(new MyNode(std));
            lastNode = lastNode.getNextNode();
            statADT.setData(lastNode.getData().getTotalScore());
        }
    }

    @Override
    public boolean empty() {
        return firstNode == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public double getMean() {
        return statADT.getMean();
    }

    @Override
    public double getSD() {
        return statADT.getSD();
    }

    @Override
    public double getMax() {
        return statADT.getMax();
    }

    @Override
    public double getMin() {
        return statADT.getMin();
    }

    @Override
    public double getTotal() {
        return statADT.getTotal();
    }
}