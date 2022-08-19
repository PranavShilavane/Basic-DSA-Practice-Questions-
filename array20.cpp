/*

Find the maximum product of two integer in an array.

Given an integer array, find the maximun product of two integer in it.

*/ 

#include <bits/stdc++.h>
using namespace std;

void findMaximumProduct(int arr[], int n)
{
    int max = 0;
    int maxi, maxj;

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n - 1; j++)
        {
            if (arr[i] * arr[j] > max)
            {
                maxi = i;
                maxi = j = j;
            }
        }
    }
    cout << "Pair is (" << arr[maix] << "," << arr[maxj] << ")";
}

int main()
{

    return 0;
}