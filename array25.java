/*

 Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i]amount of money present in it.

Example 1:

Input:
n = 6
a[] = {5,5,10,100,10,5}
Output: 110
Explanation: 5+100+5=110

Example 2:

Input:
n = 3
a[] = {1,2,3}
Output: 4
Explanation: 1+3=4
  
*/

public class array25 {

    public static int FindMaxSum(int[] arr, int n) {

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sumEven += arr[i];
            if (i % 2 != 0)
                sumOdd += arr[i];
        }

        return (sumEven > sumOdd) ? sumEven : sumOdd;

    }

    public static void main(String[] args) {

        int a[] = { 5, 5, 10, 100, 10, 5 };

        System.out.println(FindMaxSum(a, a.length));
    }

}
