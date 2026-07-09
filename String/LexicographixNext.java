import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int shift = sc.nextInt();

        if (shift == 0) {
            System.out.println("Invalid Input");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + shift) % 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + shift) % 26);
            }
            else if (ch >= '0' && ch <= '9') {
                ch = (char) ('0' + (ch - '0' + shift) % 10);
            }

            result.append(ch);
        }

        System.out.println(result);
    }
}
