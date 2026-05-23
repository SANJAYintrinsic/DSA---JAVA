import java.util.*;

public class SlidingWindowMaximum {

    // Function to find maximum in each sliding window
    public static int[] maxslide(int[] nums, int k) {

        int n = nums.length;

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n - k + 1];

        // Process first window
        for (int i = 0; i < k; i++) {

            // Remove smaller elements from back
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] <= nums[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);
        }

        // Maximum of first window
        result[0] = nums[deque.peekFirst()];

        // Process remaining windows
        for (int i = k; i < n; i++) {

            // Remove elements outside current window
            if (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] <= nums[i]) {

                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Store maximum
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] result = maxslide(nums, k);

        System.out.println("Sliding Window Maximum:");

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
