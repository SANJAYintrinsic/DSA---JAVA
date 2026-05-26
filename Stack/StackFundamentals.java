import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // size
        System.out.println("Size: " + stack.size());

        // top element
        System.out.println("Top: " + stack.peek());

        // remove top
        System.out.println("Popped: " + stack.pop());

        // size after pop
        System.out.println("Size after pop: " + stack.size());

        System.out.println("Stack after pop: " + stack);

        // check empty
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
