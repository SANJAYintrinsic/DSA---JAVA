import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 5};

        Arrays.sort(arr);

        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected) {
                System.out.println("Missing Number = " + expected);
                return;
            }
            expected++;
        }

        System.out.println("Missing Number = " + expected);
    }
}
