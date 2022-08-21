import javax.swing.*;
public class ColorsTest {
    public static void main(String[] args){
        char choice;
        String inpStr;
        MyColor.ColorsEnum color1, color2;
        MyColor.ColorsEnum color3[] = new MyColor.ColorsEnum[2];
        MyColor mixColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor pColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor formColor = new MyColor(MyColor.ColorsEnum.RED);
        MyColor assignColor = new MyColor(MyColor.ColorsEnum.RED);
        choice = 0;
        try {
            while (choice != '9'){
                boolean result1, result2;
                inpStr = JOptionPane.showInputDialog(null, """
                        Test operations of ADT Color
                        1 Mix
                        2 Primary
                        3 Form
                        4 Assign
                        9 Quit""");
                choice = inpStr.charAt(0);
                if (choice == '1'){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the first primary color:"));
                    while (pColor.primary(color1)== false){
                        color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is primary:"));
                    }
                    color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the second primary color:"));
                    while (pColor.primary(color2) == false || color2 == color1){
                        color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is primary and not the same as las:"));
                    }
                    System.out.println(mixColor.mix(color1, color2));
                } else if (choice == '2'){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the color:"));
                    if(pColor.primary(color1)){
                        System.out.println("A primary Color");
                    } else {
                        System.out.println(color1);
                        System.out.println("Not a primary Color");
                    }
                } else if (choice == '3'){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the color:"));
                    while (pColor.primary(color1) == true){
                        color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is not primary:"));
                    }
                    color3 = formColor.form(color1);
                    System.out.println(color3[0]+" "+color3[1]+" that form the color "+color1);
                } else if (choice == '4'){
                    color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the color:"));
                    while (pColor.primary(color1) == false){
                        color1 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is primary:"));
                    }
                    color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Enter the second color to replace the previous one:"));
                    while (pColor.primary(color2) == false){
                        color2 = MyColor.ColorsEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the color that is primary:"));
                    }
                    System.out.println("The first color was assign to "+assignColor.assign(color2));
                } else if (choice == '5'){
                    System.out.println(MyColor.getMyColor());
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Operation not expected, Terminating");
        }
    }

}