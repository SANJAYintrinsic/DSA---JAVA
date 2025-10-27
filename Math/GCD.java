import java.util.Scanner;

public class GCDExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Math.abs(sc.nextInt());  // take absolute value

        System.out.print("Enter second number: ");
        int b = Math.abs(sc.nextInt());

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
        sc.close();
    }
}
