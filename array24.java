/* 

First and last occurrences of x
BasicAccuracy: 53.04%Submissions: 92068Points: 1
Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
occurrence of 5 is at index 5.  

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

*/
public class array24 {

    public static void find(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++)
            if (arr[i] == x) {
                System.out.print(i + " ");
                break;
            }

        for (int i = n - 1; i >= 0; i--)
            if (arr[i] == x) {
                System.out.print(i);
                break;
            }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        int x = 5;

        find(arr, arr.length, x);

    }

}
