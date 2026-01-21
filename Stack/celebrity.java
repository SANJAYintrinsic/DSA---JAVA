import java.util.Scanner;

class Celebrity {

    static int findCelebrity(int[][] M, int n) {
        int i = 0, j = n - 1;

        // Step 1: Find potential celebrity
        while (i < j) {
            if (M[i][j] == 1) {
                i++;      // i knows j
            } else {
                j--;      // i doesn't know j
            }
        }

        int candidate = i;

        // Step 2: Verify candidate
        for (int k = 0; k < n; k++) {
            if (k != candidate) {
                if (M[candidate][k] == 1 || M[k][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];

        System.out.println("Enter the matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int result = findCelebrity(M, n);

        if (result == -1) {
            System.out.println("No Celebrity Found");
        } else {
            System.out.println("Celebrity is person: " + result);
        }
    }
}
