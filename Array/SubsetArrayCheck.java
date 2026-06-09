import java.util.*;

class Subsetarray{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={2,4};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        boolean subset=true;

        for(int num:arr2){
            if(!map.containsKey(num) || map.get(num)==0){
                subset=false;
                break;
            }
            else{
                map.put(num,map.get(num)-1);
            }
        }
        if(subset){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
