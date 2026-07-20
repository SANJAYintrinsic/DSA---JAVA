import java.util.*;

// System.out.printf("%.5f",oddavg);

class Wordcount{

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        /*for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }*/
        
        int[][] rotate=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rotate[j][row-1-i]=matrix[i][j];
            }
        }

        int[][] eight = new int[row][col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                eight[j][col - 1 - i] = rotate[i][j];
            }
        }

        for(int[] rows:eight){
            for(int n:rows){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}
