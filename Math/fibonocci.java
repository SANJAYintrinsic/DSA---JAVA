import java.util.Scanner;

class fibo{

    static void fibonocci(int n){

        int n1=0,n2=1;

        for(int i=0;i<n;i++){

            System.out.print(n1+" ");

            int n3=n2+n1;
                n1=n2;
                n2=n3;
        }
    }
    public static void main(String[] args){

        int n=10;
        fibonocci(n);
    }
}
