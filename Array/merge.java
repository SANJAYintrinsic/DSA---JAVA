import java.util.*;

class MergeAndSort {
    public static void main(String[] args) {

        int arr1[] = {5, 2, 8};
        int arr2[] = {1, 9, 3};

        int merged[] = new int[arr1.length + arr2.length];

        int count = 0;

        // Merge first array
        for (int i = 0; i < arr1.length; i++) {
            merged[count] = arr1[i];
            count++;
        }

        // Merge second array
        for (int i = 0; i < arr2.length; i++) {
            merged[count] = arr2[i];
            count++;
        }

        // Sort the merged array
        Arrays.sort(merged);

        // Print only the sorted array
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
