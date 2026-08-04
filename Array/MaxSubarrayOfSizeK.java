public class MaxSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k]; // Remove first element
            windowSum = windowSum + arr[i];     // Add next element

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
