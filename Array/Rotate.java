import java.util.*;

class Rotate{               // T - O(N)  S - O(D)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements: ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the D to shift: ");
        int d=sc.nextInt();
        d=d%n;

        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }

        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
