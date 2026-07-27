import java.util.*;

public class Main {

    static boolean found = false;

    public static void findSubsequence(int[] arr, int index, int sum, int target,
                                       ArrayList<Integer> list) {

        // If we have processed all elements
        if (index == arr.length) {
            if (sum == target) {
                found = true;

                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }

        // Include current element
        list.add(arr[index]);
        findSubsequence(arr, index + 1, sum + arr[index], target, list);

        // Backtrack (remove last element)
        list.remove(list.size() - 1);

        // Exclude current element
        findSubsequence(arr, index + 1, sum, target, list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        findSubsequence(arr, 0, 0, k, list);

        if (!found) {
            System.out.println("No target sum");
        }
    }
}
