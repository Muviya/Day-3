import java.util.*;
class addmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row = sc.nextInt();
        System.out.println("Enter the no of column:");
        int column = sc.nextInt();
        int[][] matrix1 = new int [row][column];
        int[][] matrix2 = new int [row][column];
        int[][] sum = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix1 [i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix2 [i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("The sum of elements is:");
         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(sum[i][j]);
            }
        }
        System.out.println();
        sc.close();
    }
}