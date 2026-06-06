import java.util.*;

class Sortchar{
    public static void main(String[] args){
        String str="All is Well";
        str=str.toLowerCase().replace(" ","");

        char[] ch=str.toCharArray();

        Arrays.sort(ch);

        String sort=new String(ch);
        System.out.print(sort);
    }
}
