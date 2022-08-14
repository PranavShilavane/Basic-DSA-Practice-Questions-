// Sorting array using Bubble Sort method of sorting

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

void printArray(int *array, int n)
{
    for (int i = 0; i < n; i++)
        cout << array[i] << "\t";
}

int main()
{
    int n = 7;
    int array[n] = {4, 7, 3, 6, 1, 5, 2};

    cout << "Array before sorting : " << endl;
    printArray(array, n);

    sort(array, n);

    cout << "\n\nArray after sorting : " << endl;
    printArray(array, n);

    return 0;
}