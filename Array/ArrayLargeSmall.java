import java.util.Scanner;
import java.util.*;

class arrbigone{            //    T - O(N)   S - O(N)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the elements: ");
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int Slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }

        int Smallest=arr[0];
        int SSmallest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]<Smallest){
                SSmallest=Smallest;
                Smallest=arr[i];
            }
            else if(arr[i]>Smallest && arr[i]<SSmallest){
                SSmallest=arr[i];
            }
        }

        System.out.print("Largest in array: "+ largest);
        System.out.print("\n" + "Second largest: "+ Slargest);
        System.out.print("\n" + "Smallest in array: "+ Smallest);
        System.out.print("\n" + "Second Smallest: "+ SSmallest);
    }
}
