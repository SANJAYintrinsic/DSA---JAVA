import java.util.Scanner;

public class PalindromeInRange {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
