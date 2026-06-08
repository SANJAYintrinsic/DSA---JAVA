import java.util.*;

class Charfreq{
    public static void main(String[] args){
        String str="All is Well";
        str=str.toLowerCase();

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(ch!=' '){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
