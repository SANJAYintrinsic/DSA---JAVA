public class NumberedPyramid {
    public static void main(String[] args) {
        int n = 5; // total rows

        for (int i = 1; i <= n; i++) {  // no of lines
            // Print spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars (increase 1, 2, 3, 4, 5)
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
