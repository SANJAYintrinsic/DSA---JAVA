public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = kadane(arr);
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    //  T- O(N) , S- O(1)

    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];   // Stores the maximum sum found so far
        int currentSum = arr[0]; // Stores the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            // Add the current element to currentSum or start a new subarray from current element
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update maxSoFar if we found a new maximum
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
