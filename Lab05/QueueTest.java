import javax.swing.*;
import java.text.DecimalFormat;
public class QueueTest {
    static ListADT data;
    static int total;
    static Student std;
    
    public static void main(String[] args)throws Exception{
        try{
        total = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of students: "));
        //data = new ArrayList(total);
        //data = new LinkedList();
        data = new DoubleLinkedList();
        readData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        finally{
            printTable();
        }
    }
    public static void readData() throws Exception{
        String id,name;
        double mid,fin,quiz,prj,col;
        for(int i=0;i<total;i++){
            id = JOptionPane.showInputDialog(null,"Input ID of student."+(i+1));
            name = JOptionPane.showInputDialog(null,"Input name of student."+(i+1));
            mid = Double.parseDouble(JOptionPane.showInputDialog(null,"Input mid-score of student."+(i+1)));
            fin = Double.parseDouble(JOptionPane.showInputDialog(null,"Input final-score of student."+(i+1)));
            quiz = Double.parseDouble(JOptionPane.showInputDialog(null,"Input quiz-score of student."+(i+1)));
            col = Double.parseDouble(JOptionPane.showInputDialog(null,"Input collaboration-score of student."+(i+1)));
            prj = Double.parseDouble(JOptionPane.showInputDialog(null,"Input project-score of student."+(i+1)));
            std = new Student(id,name,mid,fin,quiz,col,prj);
            data.insert(std);
        }
    }
    public static void printTable() throws Exception{
        DecimalFormat df = new DecimalFormat("0.00");
        data.findFirst();
        for (int i = 0;i<total;i++){
            std = (Student) data.retrive();
            data.findNext();
            System.out.println("\nID: "+std.getId()+" Name: "+std.getName()+" Mid-score: "+df.format(std.getMidScore())+" Final-score: "+df.format(std.getFinalScore())+" Quiz-score: "+
            df.format(std.getQuizScore())+" Collaboration-score: "+df.format(std.getCollabScore())+" Project-score: "+df.format(std.getPrjScore())+" Total-score: "+df.format(std.getTotalScore())+"\n");
        }
}
}
