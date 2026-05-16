import java.util.*;

class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 15};

        int target = 9;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            // Safer mid calculation
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
