import java.util.Scanner;
import java.util.*;

class sortCheck{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        boolean sort=true;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sort=false;
                break;
            }
        }

        if(sort){
            System.out.print("sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
