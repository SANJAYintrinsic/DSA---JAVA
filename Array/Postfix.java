import java.util.Stack;

public class PostfixEvaluation {

    public static void main(String[] args) {

        String exp = "231*+9-";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            // Operator
            else {

                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println("Result = " + stack.pop());
    }
}



import java.util.Stack;

public class PrefixEvaluation {

    public static void main(String[] args) {

        String exp = "-+2*319";

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            // Operator
            else {

                int a = stack.pop();
                int b = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println("Result = " + stack.pop());
    }
}
