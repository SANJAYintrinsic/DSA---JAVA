import java.util.Scanner;

public class ParkingSlot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the matrix (0 for Empty, 1 for Full):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxOnes = 0;
        int rowIndex = -1;

        // Count number of 1's in every row
        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 1) {
                    count++;
                }

            }

            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        if (rowIndex == -1) {
            System.out.println("No occupied parking slots found.");
        } else {
            System.out.println("Row with maximum occupied slots = " + rowIndex);
            System.out.println("Number of occupied slots = " + maxOnes);
        }

        sc.close();
    }
}
