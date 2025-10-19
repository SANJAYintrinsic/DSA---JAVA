max num of ones after flip

o(N) time
o(1) space

public class MaxConsecutiveOnesIII {

    int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0;
        int max_ones = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                zeroCount++;

            while (zeroCount > k) {
                if (nums[start] == 0)
                    zeroCount--;
                start++;
            }

            max_ones = Math.max(max_ones, end - start + 1);
        }

        return max_ones;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesIII obj = new MaxConsecutiveOnesIII();

        // Example input
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;

        int result = obj.longestOnes(nums, k);
        System.out.println("Maximum consecutive 1s after flipping " + k + " zeros: " + result);
    }
}
