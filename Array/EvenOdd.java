public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 55, 68};

        int evenSum = 0, evenCount = 0;
        int oddSum = 0, oddCount = 0;

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenSum += num;
                evenCount++;
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddSum += num;
                oddCount++;
            }
        }

        // Calculate averages
        double evenAverage = (evenCount > 0) ? (double) evenSum / evenCount : 0;
        double oddAverage = (oddCount > 0) ? (double) oddSum / oddCount : 0;

        System.out.println("\n\nAverage of Even Numbers: " + evenAverage);
        System.out.println("Average of Odd Numbers: " + oddAverage);
    }
}
