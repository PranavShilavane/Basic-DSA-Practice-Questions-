/*

Even Number of Digits
Given an array of integers, find the elements which have an even number of digits.

Example
Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]

Answer: 42, 5775, 34, 45, 3556
The order of the returned elements should be the same as the order of the initial array.

*/

#include <bits/stdc++.h>
using namespace std;
int countDigit(int n)
{
    if (n == 0)
        return 1;

    int digit = 0;
    while (n > 0)
    {
        digit++;
        n /= 10;
    }
    return digit;
}

int main()
{
    int arr[] = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};

    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
    {
        if (countDigit(arr[i]) % 2 == 0)
            cout << arr[i] << " ";
    }

    return 0;
}