import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int result = 0;
        int n = String.valueOf(num).length(); // number of digits

        while (num > 0) {
            int digit = num % 10;         // extract last digit
            result += Math.pow(digit, n); // raise digit to power of n
            num /= 10;                    // remove last digit
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");

        sc.close();
    }
}
