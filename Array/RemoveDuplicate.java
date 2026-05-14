import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,4,4,5};

        int n = arr.length;

        int j = 0;

        for(int i = 1; i < n; i++) {

            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Print unique elements
        for(int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
