import javax.swing.*;

public class StatTest {
    public static void main(String[] args) {
        int total;
        int number = 0;
        Stat statAdt = new Stat();

        // while loop true
        while (true) {

            total = Integer.parseInt(JOptionPane.showInputDialog("Enter number of element : "));

            if (total <= 0 || total > 100) {
                JOptionPane.showMessageDialog(null, "Number cant be less than 0 or greater than 100");
                break;
            }

            else {
                for (int i = 0; i < total; i++) {
                    number = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));
                    statAdt.setData(i, number);
                }
                statAdt.setTotal(total);
                System.out.println();
                System.out.println("Input data are : ");
                for (int j = 0; j < statAdt.getTotal(); j++) {
                    System.out.println(statAdt.getData(j));
                }

                System.out.println("\n");
                System.out.format("%-15s %3d number is %6.1f\n", "Mean of these ", statAdt.getTotal(),statAdt.getMean());
                System.out.format("%-15s %3d number is %6.1f\n", "SD of these ", statAdt.getTotal(), statAdt.getSD());
                System.out.format("%-15s %3d number is %6.1f\n", "Max of these ", statAdt.getTotal(), statAdt.getMax());
                System.out.format("%-15s %3d number is %6.1f\n", "Min of these ", statAdt.getTotal(), statAdt.getMin());

                break;
            }
        }
    }
}