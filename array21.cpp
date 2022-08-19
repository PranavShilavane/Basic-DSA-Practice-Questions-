/*

Write a program to reverse an array or string

Given an array (or string), the task is to reverse the array/string.
Examples :

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

*/

#include <bits/stdc++.h>
using namespace std;
void reverseArray(int *arr, int n)
{

    int temp;
    for (int i = 0; i < n / 2; i++)
    {
        temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }
}
int main()
{

    int arr[] = {4, 5, 1, 2};
    int n = 4;

    reverseArray(arr, n);

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}