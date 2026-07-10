import java.util.Scanner;

public class Main {

    static long total = 0;

    static void solve(String s, int index, long sum) {

        // If all digits are used, add this partition's sum
        if (index == s.length()) {
            total += sum;
            return;
        }

        // Form numbers of different lengths
        for (int i = index; i < s.length(); i++) {

            // Built-in function to convert substring to number
            long num = Long.parseLong(s.substring(index, i + 1));

            solve(s, i + 1, sum + num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        solve(s, 0, 0);

        System.out.println(total);
    }
}
