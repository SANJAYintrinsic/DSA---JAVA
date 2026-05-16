import java.util.*;

class majority{           // Majority  > N/2
                          // Moores voting algorithm   
                          // + same element
                          // - different element

                          //  T- O(N)  S- O(1)
    public static void main(String[] args){

            int[] arr = {1,2,6,2,1,2,3,8,3,6,8,6,4,4,2};
    
            int count = 1;
            int element = arr[0];
    
            // Finding candidate
            for(int i = 1; i < arr.length; i++) {
    
                if(arr[i] == element) {
                    count++;
                }
                else {
                    count--;
                }
    
                if(count == 0) {
                    element = arr[i];
                    count = 1;
                }
            }
    
            // Verification step
            count = 0;
    
            for(int num : arr) {
                if(num == element) {
                    count++;
                }
            }
    
            if(count > arr.length / 2) {
                System.out.println("Majority Element: " + element);
            }
            else {
                System.out.println("No Majority Element");
            }
    }
}
