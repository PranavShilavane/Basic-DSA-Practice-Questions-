/* 
 
Print alternate elements of an array

You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

Example 1:

Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 3
Example 2:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
1 3 5

*/

public class array23 {

    public static void printAlternateElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };

        printAlternateElements(A);

    }

}
