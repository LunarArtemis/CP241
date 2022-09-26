import javax.swing.JOptionPane;

public class BalanceSymTest {
    public static void main(String[] args) throws Exception{

        // ArrayStack stack = new ArrayStack();
        LinkedStack stack = new LinkedStack();

        String ex = JOptionPane.showInputDialog(null, "What is your expression?");
        
        ex = ex.replaceAll("\\s", "");

        boolean balanced = true;
        int index = 0;
        char symbol;

        try {
            while (balanced && index < ex.length()) {
                symbol = ex.charAt(index);
                if (symbol == '(' || symbol == '[' || symbol == '{') {
                    stack.push(symbol);
                } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                    if (stack.isEmpty()) {
                        balanced = false;
                    } else {
                        char top = (char) stack.pop();
                        if (symbol == ')' && top != '(' || symbol == ']' && top != '[' || symbol == '}' && top != '{') {
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
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}