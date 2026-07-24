import java.util.*;

public class sumarr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        int prev=-1;

        while (start<=end) {
            
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                prev=arr[mid];
                break;
            }
            else if(arr[mid]<target){
                prev=arr[mid];
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }

        if(prev!=-1){
        System.out.print(prev);
        }
    }
}

//  CEIL

 int target=sc.nextInt();

        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        int ceil=-1;

        while (start<=end) {
            
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ceil=arr[mid];
                break;
            }
            else if(arr[mid]>target){
                ceil=arr[mid];
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }

        if(ceil!=-1){
        System.out.print(ceil);
        }
