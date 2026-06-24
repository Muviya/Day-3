import java.util.*;
class Transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row = sc.nextInt();
        System.out.println("Enter the no of column:");
        int column = sc.nextInt();
        int[][] matrix = new int [row][column];
        int[][] transpose = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose of matrix is:");
         for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.println(transpose[i][j]);
            }
        }
        System.out.println();
        sc.close();
    }
}