import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                sum += arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        if (sum == 0) {
            System.out.println(max);
        } else {
            System.out.println(sum);
        }
    }
}
