import java.util.Scanner;

class Stack {
    int top = -1;
    int mintop = -1;
    int size;
    int[] stack;
    int[] minstack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        minstack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }

        stack[++top] = value;

        if (mintop == -1 || value <= minstack[mintop]) {
            minstack[++mintop] = value;
        }

        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }

        int removed = stack[top--];

        if (removed == minstack[mintop]) {
            mintop--;
        }

        System.out.println(removed + " popped");
    }

    void min() {
        if (mintop == -1) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Minimum element: " + minstack[mintop]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);

        while (true) {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Min 6.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    s.min();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
