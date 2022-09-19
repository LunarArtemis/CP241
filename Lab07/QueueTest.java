import javax.swing.JOptionPane;

public class QueueTest {
    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Student e;
        Object obj;

        ArrayQueue queue = new ArrayQueue();
        // LinkedQueue queue = new LinkedQueue();
        while (ch != 6) {
            try {
                choice = JOptionPane.showInputDialog(null,
                        "------------------------------------ \n" +
                                "                 Menu \n" +
                                "------------------------------------ \n" +
                                "       1. Enqueue \n" +
                                "       2. Dequeue \n" +
                                "       3. Front \n" +
                                "       4. Clear \n" +
                                "       5. Size \n" +
                                "       6. Exit \n" +
                                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch (ch) {
                    case 1:
                        e = getElement();
                        obj = e;
                        queue.enqueue(obj);
                        break;
                    case 2:
                        obj = queue.dequeue();
                        e = (Student) obj;
                        printElement(e);
                        break;
                    case 3:
                        obj = queue.front();
                        e = (Student) obj;
                        printElement(e);
                        break;
                    case 4:
                        queue.clear();
                        JOptionPane.showMessageDialog(null, "Queue is cleared");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Size of queue is " + queue.length());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Goodbye");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                        break;
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
