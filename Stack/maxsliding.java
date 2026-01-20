import java.util.Scanner;

class SlidingWindowMax {

    static void maxSlidingWindow(int[] arr, int n, int k) {

        for (int i = 0; i <= n - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        maxSlidingWindow(arr, n, k);
    }
}
