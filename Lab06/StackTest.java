import javax.swing.JOptionPane;

public class StackTest {
    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Student e;
        Object obj;

        ArrayStack stack = new ArrayStack();
        // LinkedStack stack = new LinkedStack();
        while (ch != 5) {
            try {
                choice = JOptionPane.showInputDialog(null,
                        "------------------------------------ \n" +
                                "                 Menu \n" +
                                "------------------------------------ \n" +
                                "       1. Push \n" +
                                "       2. Pop \n" +
                                "       3. Top \n" +
                                "       4. Clear \n" +
                                "       5. Exit \n" +
                                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch (ch) {
                    case 1:
                        e = getElement();
                        obj = e;
                        stack.push(obj);
                        break;
                    case 2:
                        obj = stack.pop();
                        e = (Student) obj;
                        printElement(e);
                        break;
                    case 3:
                        obj = stack.top();
                        e = (Student) obj;
                        printElement(e);
                        break;
                    case 4:
                        stack.clear();
                        JOptionPane.showMessageDialog(null, "Stack s cleared");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Exit");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.exit(0);
            }
        }
    }

    public static Student getElement() {
        Student temp;
        String sID = JOptionPane.showInputDialog(null, "Please enter the student ID");
        String sName = JOptionPane.showInputDialog(null, "Please enter the student name");
        double sMid = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the student midterm mark"));
        double sFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the student final mark"));
        double sQuiz = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the student quiz mark"));
        double sProject = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Please enter the student project mark"));
        double sCollab = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Please enter the student collaboration mark"));
        temp = new Student();
        temp.setStudent(sID, sName, sMid, sFinal, sQuiz, sProject, sCollab);
        return temp;
    }

    public static void printElement(Student e) {
        if (e != null) {
            JOptionPane.showMessageDialog(null,
                    "ID: " + e.getId() +
                            "\nName: " + e.getName() +
                            "\nMidterm score: " + e.getMidScore() +
                            "\nFinal score: " + e.getFinalScore() +
                            "\nQuiz score: " + e.getQuizScore() +
                            "\nProject score: " + e.getPrjScore() +
                            "\nCollaboration score: " + e.getCollabScore());
        }
    }
}