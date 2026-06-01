import java.util.*;

public class Largestword{
    public static String large(String str){
        String[] words=str.split("\\s+");
        String largest="";

        for(int i=0;i<words.length;i++){
            if(words[i].length()>largest.length()){
                largest=words[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String str="All the very bests";
        System.out.print(large(str));
    }
}
