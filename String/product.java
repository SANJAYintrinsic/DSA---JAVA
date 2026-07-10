import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int product = 1;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            product *= digit;
        }

        System.out.println(product);
    }
}
