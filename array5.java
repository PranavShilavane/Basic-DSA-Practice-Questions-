// Given a two dimensional array, Write a program to print lower triangular matrix and upper triangular matrix. 
/* 

Examples : 

Input : matrix[3][3] = {1 2 3
                       4 5 6
                       7 8 9}
Output :
Lower : 1 0 0        Upper : 1 2 3
        4 5 0                0 5 6
        7 8 9                0 0 9

Input : matrix[3][3] = {7 8 9
                        3 2 1
                        6 5 4}
Output :
Lower : 7 0 0       Upper : 7 8 9
        3 2 0               0 2 1
        6 5 4               0 0 4

*/

public class array5 {
    public static void main(String args[]) {

        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };

        int row = 3, col = 3;

        System.out.println("Upper triangular matrix : ");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++)
                if (i > j)
                    System.out.print(0 + " ");
                else
                    System.out.print(A[i][j] + " ");
            System.out.println("");
        }

        System.out.println("Lower triangular matrix : ");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++)
                if (i < j)
                    System.out.print(0 + " ");
                else
                    System.out.print(A[i][j] + " ");
            System.out.println("");
        }
    }

}
