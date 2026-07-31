import java.util.*;

public class sumarr {
    public static void main(String[] args) {

        int[] arr = {2,1,5,4,7,9};

        Arrays.sort(arr);

        int expected = 1;

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > expected) {
                System.out.print(expected + " ");
                expected++;
            }

            if (arr[i] == expected) {
                expected++;
            }
        }
    }
}
