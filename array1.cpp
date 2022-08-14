// Given an array of size N - 1 such that it only contains distinct integers in the range of 1 to N.Find the missing element.
/*

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}

Output: 9

*/

#include <bits/stdc++.h>
using namespace std;
void sort(int *array, int n)
{
    for (int i = 0; i < (n - 1); i++)
        for (int j = 0; j < (n - 1); j++)
            if (array[j] > array[j + 1])
            {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
}

int giveMissingElement(int *array, int n)
{
    for (int i = 0; i < n; i++)
        if (array[i + 1] != (array[i] + 1))
            return array[i] + 1;
}

int main()
{
    int array[7] = {1, 3, 6, 4, 2, 5};

    sort(array, 7);

    cout << giveMissingElement(array, 7);

    return 0;
}
