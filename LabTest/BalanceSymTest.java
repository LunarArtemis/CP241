import javax.swing.JOptionPane;

public class BalanceSymTest {
    public static void main(String[] args) throws Exception {

        // ArrayStack stack = new ArrayStack();
        LinkedStack stack = new LinkedStack();

        String ex = JOptionPane.showInputDialog(null, "What is your expression?");
        
        // replace all spaces with empty string
        ex = ex.replaceAll("\\s", "");

        boolean balanced = true;
        int index = 0;
        String symbol;

        try {
            while (balanced && index < ex.length()) {
                symbol = ex.substring(index, index + 1);
                if (symbol.equals("(") || symbol.equals("[") || symbol.equals("{")) {
                    stack.push(symbol);
                } else if (symbol.equals(")") || symbol.equals("]") || symbol.equals("}")) {
                    if (stack.isEmpty()) {
                        balanced = false;
                    } else {
                        String top = (String) stack.pop();
                        if (symbol.equals(")") && !top.equals("(") || symbol.equals("]") && !top.equals("[") || symbol.equals("}") && !top.equals("{")) {
                            balanced = false;
                        }
                    }
                }
                index++;
            }
            if (balanced && stack.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The expression is balanced");
            } else if (balanced && stack.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Stack is empty :Not Balancing Symbol");
            }
            else if (balanced && !stack.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Illegal Expression : Not Balancing Symbol");
            }
            else {
                JOptionPane.showMessageDialog(null, "The expression is not balanced at position " + index);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The expression is not balanced");
        }
    }
}