import java.util.*;

public class sumarr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] arr={1,7,5,2,9,4,5,6};
        int n=arr.length;
        int target=8;
        boolean found=false;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.print(i+" "+j+" "+k);
                        found=true;
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            if(found){
                break;
            }
        }

        if(!found){
            System.out.print("No");
        }
    }
}





import java.util.*;

public class sumarr {
    public static void main(String[] args) {

        int[] arr = {1, 7, 5, 2, 9, 4, 5, 6};
        int n = arr.length;
        int target = 15;
        boolean found = false;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {

                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        break;
                }

                if (found)
                    break;
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("No");
        }
    }
}
