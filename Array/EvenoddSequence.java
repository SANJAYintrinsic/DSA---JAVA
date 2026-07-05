public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 55, 68};

        System.out.print("Sequence: ");

        // Print even numbers first
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // Print odd numbers next
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
