/*

Given an array arr[] of distinct elements size N that is sorted and then around an unknown point, the task is to check if the array has a pair with a given sum X.

Examples :

Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
Output: true
Explanation: There is a pair (6, 10) with sum 16

Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
Output: false
Explanation: There is no pair with sum 45.

*/

#include <bits/stdc++.h>
using namespace std;

bool pairInSortedRotated(int *arr, int N, int X)
{
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            if (i == j)
                continue;
            else if ((arr[i] + arr[j]) == X)
                return true;

    return false;
}

int main()
{
    int arr[] = {11, 15, 5, 8, 9, 10};
    int X = 16;
    int N = sizeof(arr) / sizeof(arr[0]);

    if (pairInSortedRotated(arr, N, X))
        cout << "true";
    else
        cout << "false";

    return 0;
}