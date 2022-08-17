/*
 
given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of the elements of nums except nums[i]

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]




*/

class Solution {
    public static int[] productExceptSelf(int arr[]) {

        int n = arr.length;
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                A[i] *= arr[j];
            }
        }

        return A;
    }

}

public class array14 {

    public static void main(String[] args) {

        int A[] = { -1, 1, 0, -3, 3 };
        // int A[] = { 1, 2, 3, 4 };
        int B[] = Solution.productExceptSelf(A);

        for (int i = 0; i < A.length; i++)
            System.out.print(B[i] + " ");
    }

}