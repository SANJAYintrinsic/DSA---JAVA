import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {20, 15, 26, 2, 98, 6};

        int n = arr.length;

        // Copy array
        int[] temp = arr.clone();

        // Sort copied array
        Arrays.sort(temp);

        // Store ranks
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = 0; i < n; i++) {

            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        // Replace elements by rank
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
