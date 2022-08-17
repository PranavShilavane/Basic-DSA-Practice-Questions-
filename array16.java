/* 
 
Given an array (or string), the task is to reverse the array/string.
Examples : 
 
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

*/

public class array16 {

    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = A.length;

        int temp;
        for (int i = 0; i < N / 2; i++) {
            temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }

        System.out.println("arr[] = ");
        for (int i = 0; i < N; i++)
            System.out.print(A[i] + " ");

    }

}
