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


import java.util.*;

class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation: ");
        int d = sc.nextInt();

        d = d % n;

        // Store last d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }

        // Shift remaining elements to the right
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        // Copy temp to beginning
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
