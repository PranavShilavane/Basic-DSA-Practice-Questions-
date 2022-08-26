#include <bits/stdc++.h>
using namespace std;
int linearSearch(int *arr, int x, int n)
{
    for (int i = 0; i < n; i++)
        if (arr[i] == x)
            return i;

    return -1;
}
int main()
{
    int arr[] = {7, 6, 5, 4, 3, 2, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x;

    cout << "Enter the element to search : ";
    cin >> x;

    if (linearSearch(arr, x, n) != -1)
        cout << "Element Exist in array : Index = " << linearSearch(arr, x, n);
    else
        cout << "Element DOES NOT EXIST in array...";

    return 0;
}