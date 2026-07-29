import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] negative = new int[n];
        int[] positive = new int[n];

        int negCount = 0;
        int posCount = 0;

        // Read input and separate
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < 0) {
                negative[negCount] = arr[i];
                negCount++;
            } else {
                positive[posCount] = arr[i];   // 0 is positive
                posCount++;
            }
        }

        // Print original array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int i = 0, j = 0;

        // Print alternately
        while (i < negCount && j < posCount) {
            System.out.print(negative[i] + " ");
            i++;

            System.out.print(positive[j] + " ");
            j++;
        }

        // Remaining negatives
        while (i < negCount) {
            System.out.print(negative[i] + " ");
            i++;
        }

        // Remaining positives
        while (j < posCount) {
            System.out.print(positive[j] + " ");
            j++;
        }
    }
}
