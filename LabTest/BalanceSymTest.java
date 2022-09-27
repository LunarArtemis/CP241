import javax.swing.JOptionPane;

public class BalanceSymTest {
    public static void main(String[] args) throws Exception {

        // ArrayStack stack = new ArrayStack();
        LinkedStack stack = new LinkedStack();

        boolean balanced  = true;
        int index  =0;
        char symbol;

        try {
            String ex = JOptionPane.showInputDialog(null, "Enter");
            ex = ex.replace(" ", "");

            while (balanced && index < ex.length()) {
                symbol = ex.charAt(index);
                if (symbol == '(' || symbol == '{' || symbol == '[') {
                    stack.push(symbol);
                } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        throw new Exception("Stack is empty :Not Balancing Symbol");
                    } else {
                        char top = (char) stack.pop();
                        if (symbol == ')' && top != '(' || symbol == '}' && top != '{' || symbol == ']' && top != '[') {
                            balanced = false;
                            throw new Exception( "The expression is not balanced at position " + (index + 1));
                        }
                    }
                }
                index++;
            }


            if (balanced && stack.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The expression is balanced");
            } else if (balanced && !stack.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Illegal Expression : Not Balancing Symbol");
            }

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}