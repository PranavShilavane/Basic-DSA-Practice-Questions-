/*
 
Write a program to remove Duplicate elements from a sorted array

 */
public class array22 {

    public static void removeDuplicate(int[] arr, int n) {

        for (int i = 0; i < (n - 1); i++)
            if (arr[i] == arr[i + 1]) {
                for (int j = (i + 1); j < (n - 1); j++)
                    arr[j] = arr[j + 1];
                n--;
                i--;
            }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };

        removeDuplicate(arr, arr.length);

    }
}