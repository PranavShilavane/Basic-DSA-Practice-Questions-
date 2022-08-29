/*
 * 
 * Maximize sum(arr[i]*i) of an Array
 * 
 * Given an array A of N integers. Your task is to write a program to find the
 * maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
 * 
 * You are allowed to rearrange the elements of the array. 
 * 
 * Example 1:
 * 
 * Input : Arr[] = {5, 3, 2, 4, 1}
 * Output : 40
 * 
 * Explanation:
 * If we arrange the array as 1 2 3 4 5 then
 * we can see that the minimum index will multiply
 * with minimum number and maximum index will
 * multiply with maximum number.
 * 
 * So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 
 *   
 * Example 2:
 * 
 * Input : Arr[] = {1, 2, 3}
 * Output : 8
 * 
 */

public class array33 {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++)

            for (int j = 0; j < arr.length - i - 1; j++)

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static int maxSum(int arr[]) {

        sort(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i] * i;

        return sum;
    }

    public static void main(String[] args) {

        int Arr[] = { 5, 3, 2, 4, 1 };

        System.out.println(maxSum(Arr));

    }
}