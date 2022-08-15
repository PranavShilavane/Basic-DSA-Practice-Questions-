/* 

 Given a matrix and a scalar element k, our task is to find out the scalar product of that matrix. 
Examples: 
 

Input : mat[][] = {{2, 3}
                   {5, 4}}
        k = 5
Output : 10 15 
         25 20 
We multiply 5 with every element.

Input : 1 2 3 
        4 5 6
        7 8 9
        k = 4
Output :  4 8  12
          16 20 24
          28 32 36  

*/

public class array8 {
    static final int N = 3;

    public static void multiplyWithScalar(int[][] mat, int k) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                mat[i][j] *= k;

    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3 }, { 3, 5, 4 }, { 6, 8, 9 } };
        int k = 3;

        multiplyWithScalar(mat, k);

        System.out.println("New matrix : ");
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
