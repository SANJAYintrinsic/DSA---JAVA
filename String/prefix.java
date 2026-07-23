import java.util.*;

class Wordcount{

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] str=new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }

        String prefix=str[0];

        for(int i=1;i<str.length;i++){

            while (!str[i].startsWith(prefix)) {
                
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.length()==0){
                    System.out.println("");
                }
            }
        }

        System.out.print(prefix);
    } 
}
