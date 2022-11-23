import java.util.Scanner;

public class MatrixMultiplicationExample{
    public static void matrixMultiplication(int [][]a,int [][] b,int m,int n){
        int c[][]=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j]; // changing k for 'a' matrix in column wise for 'b' row wise
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
    public static void main(String args[]){
//creating two matrices
        int a[][];
        int b[][];
        int m,n; // for row and column size

        Scanner in = new Scanner(System.in); //input object
         m = in.nextInt();  //input function to take integer input for row = m and col = n
         n = in.nextInt();

         a = new int[m][n]; //declaring a and b matrix in m*n size
         b = new int[m][n];

         for (int i = 0;i<n;i++){    // taking input of a matrix
             for(int j = 0;j<m;j++){
                 a[i][j] = in.nextInt();
             }
         }

        for (int i = 0;i<n;i++){  // taking input of matrix
            for(int j = 0;j<m;j++){
                b[i][j] = in.nextInt();
            }
        }

        int c[][]=new int[m][n];

        matrixMultiplication(a,b,m,n);
    }
}
