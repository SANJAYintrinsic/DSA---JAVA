import java.util.*;

class MostRepeated {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3,4,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int element = arr[0];

        // Find maximum frequency
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                element = entry.getKey();
            }
        }

        System.out.println("Most Repeated Element: " + element);
        System.out.println("Frequency: " + maxCount);
    }
}
