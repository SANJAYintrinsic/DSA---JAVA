import java.util.*;
import java.util.Scanner;

public class arrbigone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];    // Time complexity O(N)
        int Slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest ){
                Slargest=arr[i];
            }
        }

        System.out.print("Largest element in array : "+largest);
        System.out.print("\n"+"Seocnd Largest element in array : "+Slargest);
    }
}
