import java.util.*;

class Substri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();

        int position=str.indexOf(str2);

        if(position!=-1){
        System.out.print(position);
        }
        else{
            System.out.print("Not found");
        }
    }
}
