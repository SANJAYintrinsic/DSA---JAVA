public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // return index if found
            }
        }
        return -1;  // return -1 if not found
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int key = 30;

        int result = linearSearch(nums, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
