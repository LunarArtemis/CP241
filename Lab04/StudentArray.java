public class StudentArray implements StudentADT{
    Student [] allStudent;
    int totalStd;
    int current;
    Stat statADT;
    
    public StudentArray() {
        allStudent = new Student[100];
        totalStd = 0;
        current = 0;
    }
    // public Student[] getInfo() {
    //     Student [] info = {allStudent[current].id,allStudent[current].name,Double.toString(allStudent[current].midScore),Double.toString(allStudent[current].finalScore),Double.toString(allStudent[current].quizScore),Double.toString(allStudent[current].collabScore),Double.toString(allStudent[current].prjScore)};
    //     return info;
    // }
    @Override
    public Student getCurrentStudent() {
        return allStudent[current++];
    }
    @Override
    public void setCurrentStudent(Student std) {
        allStudent[totalStd] = std;
        totalStd++;
        statADT = new Stat();
        for (int x=0; x<totalStd; x++) {
            statADT.setData(allStudent[x].getTotalScore());
        }
        
    }
    @Override
    public boolean empty() {
        return totalStd >= 0;
    }
    @Override
    public boolean full() {
        return totalStd == 100;
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
