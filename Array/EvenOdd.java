import java.util.*;

class evenodd{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};

        int evencount=0,evennum=0;
        int oddcount=0,oddnum=0;

        System.out.print("Sequence : ");

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                evennum+=arr[i];
                evencount++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
                oddnum+=arr[i];
                oddcount++;
            }
        }

        double evenavg= (evencount>0) ? (double) evennum/evencount : 0;
        double oddavg=  (oddcount>0) ? (double) oddnum/oddcount : 0;

        System.out.println();
        System.out.println("EvenAVG : "+evenavg);
        System.out.print("OddAVG : "+oddavg);
    }
}
