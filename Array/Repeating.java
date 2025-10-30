import java.util.Scanner;
import java.util.HashSet;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // To store unique and repeating elements
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
        
            if (seen.contains(num)) {
                repeated.add(num);
            } else {
                seen.add(num);
            }
        }

        // Display result
        if (repeated.isEmpty()) {
            System.out.println("No repeating numbers found.");
        } else {
            System.out.println("Repeating numbers: " + repeated);
        }

        sc.close();
    }
}
