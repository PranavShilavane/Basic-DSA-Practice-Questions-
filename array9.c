/*

Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example:

Input matrix
0 1 1 1
0 0 1 1
1 1 1 1  // this row has maximum 1s
0 0 0 0

Output: 2

*/

#include <stdio.h>
#include <stdbool.h>
int maxOneRow(int r, int c, bool a[r][c])
{
    int A[r];

    for (int i = 0; i < r; i++)
    {
        A[i] = 0;

        for (int j = 0; j < c; j++)
            if (a[i][j] == 1)
                A[i]++;
    }

    int max = 0;

    for (int i = 0; i < r; i++)
        if (A[i] > A[max])
            max = i;

    return max;
}
int main()
#define R 4
#define C 4
{

    bool mat[R][C] = {
        {0, 0, 0, 1},
        {1, 1, 1, 1},
        {1, 0, 1, 1},
        {0, 0, 0, 0}};

    printf("%d\t", maxOneRow(R, C, mat));

    return 0;
}