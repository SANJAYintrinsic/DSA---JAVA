public class MaximumPathRecursion {

    static int maxSum = Integer.MIN_VALUE;

    public static void findMax(int[][] matrix, int i, int j, int sum) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Add current cell value
        sum = sum + matrix[i][j];

        // Destination reached
        if (i == rows - 1 && j == cols - 1) {

            if (sum > maxSum) {
                maxSum = sum;
            }
            return;
        }

        // Move Down
        if (i + 1 < rows) {
            findMax(matrix, i + 1, j, sum);
        }

        // Move Right
        if (j + 1 < cols) {
            findMax(matrix, i, j + 1, sum);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        findMax(matrix, 0, 0, 0);

        System.out.println("Maximum Sum = " + maxSum);
    }
}
