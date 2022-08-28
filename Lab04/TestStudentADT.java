import javax.swing.*;
import java.text.DecimalFormat;

public class TestStudentADT {
    static StudentADT data;
    static int total;
    static Student std;

    public static void main(String[] args) {
        total = Integer.parseInt(JOptionPane.showInputDialog("Enter total number of students: "));
        data = new StudentArray();
        //data = new StudentLinkedList();
        readData();
        printTable();
    }

    public static void readData() {
        String id, name;
        double mid, fin, quiz, prj, col;
        for (int i = 0; i < total; i++) {
            id = JOptionPane.showInputDialog(null, "Input ID of student." + (i + 1));
            name = JOptionPane.showInputDialog(null, "Input name of student." + (i + 1));
            mid = Double.parseDouble(JOptionPane.showInputDialog(null, "Input mid-score of student." + (i + 1)));
            fin = Double.parseDouble(JOptionPane.showInputDialog(null, "Input final-score of student." + (i + 1)));
            quiz = Double.parseDouble(JOptionPane.showInputDialog(null, "Input quiz-score of student." + (i + 1)));
            col = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Input collaboration-score of student." + (i + 1)));
            prj = Double.parseDouble(JOptionPane.showInputDialog(null, "Input project-score of student." + (i + 1)));
            std = new Student(id, name, mid, fin, quiz, col, prj);
            data.setCurrentStudent(std);
        }
    }

    public static void printTable() {       
        DecimalFormat df = new DecimalFormat("0.00"); 
        try {
            for (int i = 0; i < total; i++) {
                std = data.getCurrentStudent();
                System.out.println("ID: " + std.getId() + "\tName: " + std.getName() + "\tMid-score: "
                        + df.format(std.getMidScore()) + "\tFinal-score: " + df.format(std.getFinalScore())
                        + "\tQuiz-score: " + df.format(std.getQuizScore()) + "\tCollaboration-score: "
                        + df.format(std.getCollabScore()) + "\tProject-score: " + df.format(std.getPrjScore())
                        + "\tTotal-score: " + df.format(std.getTotalScore()));
            }
        } finally {
            System.out.println("\n\n\t\tDATA STATISTICS\n");
            System.out.println("Total Data of student: " + df.format(data.getTotal()));
            System.out.println("Mean of student: " + df.format(data.getMean()));
            System.out.println("Standard deviation of student: " + df.format(data.getSD()));
            System.out.println("Maximum of student: " + df.format(data.getMax()));
            System.out.println("Minimum of student: " + df.format(data.getMin()));
        }
    }
}