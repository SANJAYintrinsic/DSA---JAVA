import java.util.*;

public class practice {
    public static Integer Numcount(int n){
        int count=0;
        if(n ==0){
            count=1;
        }
        else{
            while(n>0){
                n=n/10;
                System.out.println(n);
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number :");
    int n=sc.nextInt();
    System.out.println(Numcount(n));
}
}
