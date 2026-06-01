import java.util.*;
import java.util.Scanner;

                          // O(log n)
                          // Sorted Array
                          // mid= start+(end-start) /2

class Binarysearch{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int start=0;
        int end=arr.length-1;
        int target=10;
        boolean found=false;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                found=true;
                break;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }

        if(!found){
            System.out.print("Not Found");
        }
    }
}
