import java.util.Scanner;

class house{

    public static int robber(int[] arr){
        int n=arr.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }

        int secondlast=0;
        int last=arr[0];
        int res=last;
        for(int i=1;i<n;i++){
            res=Math.max(arr[i]+secondlast,last);
            secondlast=last;
            last=res;
        }

        return res;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        
        System.out.println(robber(arr));
    }
}
