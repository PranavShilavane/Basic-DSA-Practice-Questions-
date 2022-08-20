/* 
 
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16

Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10

*/

public class array26 {

    public static String hasArrayTwoCandidates(int[] arr, int n, int x) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((arr[i] + arr[j]) == x && (i != j))
                    return "Yes";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        int N = 6, X = 16;

        int Arr[] = { 1, 4, 45, 6, 10, 8 };

        System.out.println(hasArrayTwoCandidates(Arr, N, X));
    }

}
