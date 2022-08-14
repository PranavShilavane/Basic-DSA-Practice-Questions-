/*
Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.

Example 1:
Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}

Output: Yes

Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.

Example 2:
Input:
N = 3
Arr[] = {3, 8, 5}

Output: No

Explanation: No such triplet possible.
*/

#include <bits/stdc++.h>
using namespace std;
int findPythagoreanTriplet(int *A, int n)
{
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            for (int k = 0; k < n; k++)
                if ((A[i] * A[i]) == (A[j] * A[j] + A[k] * A[k]))
                    return 1;
    return 0;
}

int main()
{
    int n = 3;

    int A[3] = {3, 8, 5};

    cout << findPythagoreanTriplet(A, n);

    return 0;
}