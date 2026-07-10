import java.util.Scanner;

public class Main {

    static int total = 0;

    static void solve(String s, int index, int sum) {

        // Base case
        if (index == s.length()) {
            total += sum;
            return;
        }

        int number = 0;

        // Form numbers from index to i
        for (int i = index; i < s.length(); i++) {

            // Build the number digit by digit
            number = number * 10 + (s.charAt(i) - '0');

            solve(s, i + 1, sum + number);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        solve(s, 0, 0);

        System.out.println(total);
    }
}
