import java.util.HashMap;

public static boolean isSubsetWithDuplicates(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int num : arr1) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    for (int num : arr2) {
        if (!freq.containsKey(num) || freq.get(num) == 0) {
            return false;
        }
        freq.put(num, freq.get(num) - 1);
    }

    return true;
}
