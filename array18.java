/*
 
Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}
Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.

*/

public class array18 {
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        return arr;

    }

    public static int isArrayEqual(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return 0;

        return 1;
    }

    public static void main(String[] args) {

        int A[] = { 1, 2, 5, 4, 0 };

        int B[] = { 1, 4, 5, 0, 1 };

        sort(A);
        sort(B);

        System.out.println(isArrayEqual(A, B));

    }

}
