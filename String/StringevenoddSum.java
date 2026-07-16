import java.util.*;

class stringevenodd{
    public static void main(String[] args){
        String str="aabbbccddeeeee";

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int evensum=0;
        int oddsum=0;

        for(Map.Entry<Character,Integer> entry:map.entrySet()){

            int freq=entry.getValue();

            if(freq%2==0){
                evensum+=freq;
            }
            else{
                oddsum+=freq;
            }
        }

        System.out.print(evensum);
        System.out.println();
        System.out.print(oddsum);
    }
}
