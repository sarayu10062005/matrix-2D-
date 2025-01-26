
import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows of matrix: ");
        int rows=sc.nextInt();
        System.out.println("enter no.of columns of matrix: ");
        int columns = sc.nextInt();
           int[][] A = new int[rows][columns];
           int[][] B = new int[rows][columns];
           System.out.println("Enter elements of first matrix: ");
           for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                A[i][j]=sc.nextInt();
            }
           }
           System.out.println("Enter elemenst for second matrix: ");
           for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                B[i][j]=sc.nextInt();
            }
           }
           System.out.println("First matrix:");
           for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
           }
           System.out.println("Second matrix:");
           for(int i=0;i <rows; i++){
            for( int j=0;j<columns;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println(" ");
           }
           int[][] resultMatix = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        resultMatix[i][j] = A[i][j] + B[i][j];
                  }
           }
           int[][] resultMatix1 = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        resultMatix1[i][j] = A[i][j] - B[i][j];
                  }
           }

           System.out.println("\nThe sum of the two matrices is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                       
                        System.out.print(resultMatix[i][j] + " ");
                  }
                  System.out.println();
           }
           System.out.println("\nThe sub of the two matrices is: ");
           for(int i=0; i < rows; i++){
            for(int j =0 ; j < columns;j++){
                System.out.print(resultMatix1[i][j]+ " ");
            }
            System.out.println();
}
}
}


