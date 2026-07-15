import java.util.*;

public class Wordcount{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr={50,40,10,20,30};
        int n=sc.nextInt();
                               // largest= arr[arr.length - n];
                               // smallest= arr[ n - 1 ];
        Arrays.sort(arr);

        System.out.print(arr[arr.length-n]);
    }
}
