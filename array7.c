// Given a n x n matrix.The problem is to sort the given matrix
/*

Examples:

Input : mat[][] = { {5, 4, 7},
                    {1, 3, 8},
                    {2, 9, 6} }
Output : 1 2 3
         4 5 6
         7 8 9


Original Matrix:
5 4 7
1 3 8
2 9 6

Matrix After Sorting:
1 2 3
4 5 6
7 8 9

*/

#include <stdio.h>
void sortArray(int *array, int n)
{
    for (int i = 0; i < (n); i++)
        for (int j = 0; j < (n - 1); j++)
            if (array[j] > array[j + 1])
            {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
}
void sortMatrix(int row, int col, int A[row][col])
{
    int array[row * col];

    int a = 0;
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            array[a++] = A[i][j];

    sortArray(array, row * col);

    a = 0;

    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++)
            A[i][j] = array[a++];
}

void printMatrix(int row, int col, int A[row][col])
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
            printf("%d ", A[i][j]);
        printf("\n");
    }
}

int main()
{
    int A[3][3] = {3, 2, 1,
                   6, 4, 5,
                   9, 6, 8};

    int row = 3;
    int col = 3;

    printf("Original Matrix : \n");
    printMatrix(row, col, A);

    sortMatrix(row, col, A);

    printf("Matrix After Sorting : \n");
    printMatrix(row, col, A);

    return 0;
}