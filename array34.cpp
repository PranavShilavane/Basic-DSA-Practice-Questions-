/*

Find Transition Point

Given a sorted array containing only 0s and 1s, find the transition point.


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition
point where 1 begins.

Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.


*/

#include <bits/stdc++.h>
using namespace std;
int transitionPoint(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 1)
            return i;
    }
    return -1;
}
int main()
{

    int arr[] = {0, 0, 0};

    int n = sizeof(arr) / sizeof(arr[0]);

    cout << transitionPoint(arr, n);

    return 0;
}