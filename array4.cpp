// Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

#include <bits/stdc++.h>
using namespace std;
void printArray(int *a, int n);
void rotateArray(int *arr, int n, int rotate)
{
    int a[rotate];

    for (int i = 0; i < rotate; i++)
        a[i] = arr[i];

    for (int i = 0; i < rotate; i++)
        for (int j = 0; j < n; j++)
            arr[j] = arr[j + 1];

    for (int i = (n - rotate), j = 0; i < n, j < rotate; j++, i++)
        arr[i] = a[j];
}

void printArray(int *a, int n)
{
    for (int i = 0; i < n; i++)
        cout << a[i] << "\t";
}

int main()
{
    int array[] = {1, 2, 3, 4, 5, 6, 7};

    int N = sizeof(array) / sizeof(array[0]);

    cout << "Rotated array : " << endl;

    rotateArray(array, N, 3);

    printArray(array, N);

    return 0;
}
