import javax.swing.JOptionPane;

public class ListTest {

    public static void main(String[] args) throws Exception {
        String choice;
        int ch = 0;
        Student e;
        ListTest test = new ListTest();
        Object obj;

        DoubleLinkedList list = new DoubleLinkedList();

        while (ch != 8) {
            try {
                choice = JOptionPane.showInputDialog(null,
                        "------------------------------------ \n" +
                                "                                   Menu \n" +
                                "------------------------------------ \n" +
                                "       1. Insert \n" +
                                "       2. Retrieve \n" +
                                "       3. Delete \n" +
                                "       4. Update \n" +
                                "       5. Find First \n" +
                                "       6. Find Next \n" +
                                "       7. Find Key \n" +
                                "       8. Exit \n" +
                                "------------------------------------ \n");
                ch = Integer.parseInt(choice);
                switch (ch) {
                    case 1:
                        e = test.getElement();
                        obj = e;
                        list.insert(e);
                        break;
                    case 2:
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 3:
                        list.delete();
                        break;
                    case 4:
                        if (list.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "List is empty");
                        } else {
                            e = test.getElement();
                            obj = e;
                            list.update(obj);
                        }
                        break;
                    case 5:
                        // find first node
                        list.findFirst();
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 6:
                        // find next node
                        list.findNext();
                        obj = list.retrive();
                        e = (Student) obj;
                        test.printElement(e);
                        break;
                    case 7:
                        if (list.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "List is empty");
                        } else {
                            String id = JOptionPane.showInputDialog("Enter id to find");
                            list.findFirst();
                            while (list.retrive() != null) {
                                obj = list.retrive();
                                e = (Student) obj;
                                if (e.getId().equals(id)) {
                                    test.printElement(e);
                                    break;
                                }
                                list.findNext();
                            }
                        }
                        break;
                    case 8:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid choice");
            }
        }
    }

    public Student getElement() {
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

    public void printElement(Student e) {
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
