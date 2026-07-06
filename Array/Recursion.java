import java.util.*;

class Recursion {

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            int term = fibo(i);
            System.out.print(term + " ");
            sum = sum + term;
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
