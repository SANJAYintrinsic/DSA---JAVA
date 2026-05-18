public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            // Swap when negative
            if (current < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(current, maxProd * current);

            minProd = Math.min(current, minProd * current);

            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        System.out.println("Maximum Product = " + maxProduct(arr));
    }
}
