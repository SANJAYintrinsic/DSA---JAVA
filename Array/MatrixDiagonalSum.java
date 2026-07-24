public class Main {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = arr.length;

        int sum = 0;

        for(int i=0;i<n;i++){

            sum += arr[i][i];          // Primary

            sum += arr[i][n-1-i];      // Secondary
        }

        // Remove the center element once (for odd-sized matrices)
        if(n % 2 == 1){
            sum -= arr[n/2][n/2];
        }

        System.out.println("Sum of Both Diagonals = " + sum);
    }
}
