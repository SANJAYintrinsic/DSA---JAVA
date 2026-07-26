import java.util.*;

public class Rotate180 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] rotate = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotate[row - 1 - i][col - 1 - j] = matrix[i][j];
            }
        }

        for (int[] r : rotate) {
            for (int x : r) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}



import java.util.*;

public class Rotate90Clockwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] rotate = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotate[j][row - 1 - i] = matrix[i][j];
            }
        }

        for (int[] r : rotate) {
            for (int x : r) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}




import java.util.*;

public class sumarr {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }*/

        int[][] rotate=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotate[j][n-1-i]=arr[i][j];
            }
        }

        int[][] eight=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                eight[j][n-1-i]=rotate[i][j];
            }
        }

        for(int[] rows:eight){
            for(int num:rows){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        
    }
}
