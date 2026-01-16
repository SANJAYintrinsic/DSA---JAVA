import java.util.Scanner;

class Stack {
    int top = -1;
    int size;
    int[] stack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    // ONLY push method
    void push(int value) {
        stack[++top] = value;
    }
}

public class StackPermutation {

    static boolean checkPermutation(int[] input, int[] output, int n) {
        Stack s = new Stack(n);
        int j = 0; // output index

        for (int i = 0; i < n; i++) {
            // push input element
            s.push(input[i]);

            // simulate pop + peek using top
            while (s.top != -1 && s.stack[s.top] == output[j]) {
                s.top--;   // pop
                j++;
            }
        }

        return s.top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size
        int n = sc.nextInt();

        int[] input = new int[n];
        int[] output = new int[n];

        // input sequence
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // output sequence
        for (int i = 0; i < n; i++) {
            output[i] = sc.nextInt();
        }

        if (checkPermutation(input, output, n)) {
            System.out.println("Valid Stack Permutation");
        } else {
            System.out.println("Invalid Stack Permutation");
        }

        sc.close();
    }
}
