/*

Given an array A, find the maximum number of consecutive 1s in the array.

Examples :

A: [1, 1, 3, 2, 3, 1, 1, 1]
Max consecutive 1s: 3

*/

#include <bits/stdc++.h>
using namespace std;
int getConsecutiveOneNumber(int *arr, int n)
{
    int counter = 1;
    int max = 1;

    for (int i = 1; i < n; i++)
    {
        if (arr[i] == 1 && arr[i - 1] == 1)
            counter++;
        else
            counter = 1;

        if (counter > max)
            max = counter;
    }

    return max;
}

int main()
{

    int arr[] = {1, 1, 3, 2, 3, 1, 1, 1};
    
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << getConsecutiveOneNumber(arr, n);

    return 0;
}
