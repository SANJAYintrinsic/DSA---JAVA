import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 5, 4, 3};

        // Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert array to Integer array
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        // Sort
        Arrays.sort(nums, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a - b;          // Smaller element first
            }
            return map.get(b) - map.get(a); // Higher frequency first
        });

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
