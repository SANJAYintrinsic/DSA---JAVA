import java.util.*;

class Maxchar{
    public static void main(String[] args){
        String str="All is Well";
        str=str.toLowerCase();

        // LinkedHashMap - Same String Order
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(ch!=' '){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        int maxcount=0;
        char maxelement='\0';

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxcount){
                maxcount=entry.getValue();
                maxelement=entry.getKey();
            }
        }

        System.out.print(maxelement+"-"+maxcount);
    }
}
