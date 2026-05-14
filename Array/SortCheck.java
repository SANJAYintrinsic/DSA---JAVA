import java.util.Scanner;
import java.util.*;

class sortCheck{       // T- O(N)  S- O(N)
    public static void main(String[] args) {
        int[] arr={1,2,8,4,5};
        boolean sort=true;

        for(int i=1;i<5;i++){
            if(arr[i]<arr[i-1]){
                sort=false;
                break;
            }
        }

        if(sort){
            System.out.print("Sorted array");
        }
        else{
            System.out.print("Unsorted array");
        }
    }
}
