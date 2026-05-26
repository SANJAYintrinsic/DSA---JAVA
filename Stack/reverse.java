
import java.util.*;

class StackReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        // Input 5 elements
        for (int i = 0; i < 5; i++) {
            stack.push(sc.nextInt());
        }

        Stack<Integer> reverse = new Stack<>();

        // Reverse stack
        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }

        System.out.println(reverse);
    }
}
