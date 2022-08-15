/* 
You have given an integer matrix with odd dimensions. Find the square of the diagonals elements on both sides.

Examples:

Input  :  1 2 3
          4 5 6
          7 8 9
Output :  Diagonal one: 1 25 81
          Diagonal two: 9 25 49

Input  :  2 5 7  
          3 7 2
          5 6 9
Output :  Diagonal one : 4 49 81
          Diagonal two : 49 49 25

*/

public class array6 {
    public static void main(String[] args) {

        int A[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 1, 2, 3 }
        };

        int row = 3, col = 3;

        System.out.print("Diagonal One : ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (i == j)
                    System.out.print(A[i][j] * A[i][j] + " ");

        System.out.print("\nDiagonal Two : ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (i + j == col - 1)
                    System.out.print(A[i][j] * A[i][j] + " ");

    }

}
