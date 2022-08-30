/*

Smallest Positive missing number

You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.

Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing
number is 2.

*/

#include <bits/stdc++.h>
using namespace std;
void sort(int *arr, int n)
{
    // Bubble sort
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
int missingNumber(int *arr, int n)
{
    sort(arr, n);

    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i + 1] != arr[i] + 1 && arr[i] > 0)
        {
            return arr[i] + 1;
        }
    }
    return arr[n - 1] + 1;
}

int main()
{

    // int arr[] = {0, -10, 1, 3, -20};
    int arr[] = {1, 2, 3, 4, 5};

    int n = sizeof(arr) / sizeof(arr[0]);

    cout << missingNumber(arr, n);

    return 0;
}
