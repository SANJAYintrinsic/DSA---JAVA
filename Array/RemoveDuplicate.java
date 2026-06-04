
        //  T.C - O(N)  S.C - O(N)
        // LinkedHashSet<Integer> set=new LinkedHashSet<>();
        // original order of array unique elements

import java.util.*;

class Duplicate {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 2, 1, 6, 6, 6, 6};

        LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hs.add(arr[i])) {   // add() returns false if already present
                duplicate.add(arr[i]);
            }
        }

        System.out.print("Unique elements: ");
        for (int n : hs) {
            System.out.print(n + " ");
        }

        System.out.print("\nDuplicate elements: ");
        for (int num : duplicate) {
            System.out.print(num + " ");
        }
    }
}
