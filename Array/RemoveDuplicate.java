import java.util.*;

class Array{
    public static void main(String[] args) {
        int[] arr={8,4,2,5,6,1,8,9,6,4,2};
        int n=arr.length;

        //  T.C - O(N)  S.C - O(N)
        
        HashSet<Integer> hs=new HashSet<Integer>();  

        // LinkedHashSet<Integer> set=new LinkedHashSet<>();
        // original order of array unique elements

        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }

        for(int value:hs){
        System.out.print(value+" ");
        }

    }
}
