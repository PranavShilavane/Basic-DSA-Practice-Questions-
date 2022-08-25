/*

Find the largest number that can be formed with the given digits

Given an array of integers arr[] representing digits of a number. The task is to write a program to generate the largest number possible using these digits.
Note: The digits in the array are in between 0 and 9. That is, 0<arr[i]<9.

Examples:

Input : arr[] = {4, 7, 9, 2, 3}
Output : Largest number: 97432

Input : arr[] = {8, 6, 0, 4, 6, 4, 2, 7}
Output : Largest number: 87664420

*/

#include <bits/stdc++.h>
using namespace std;
int getNumberOfDigits(int n)
{
    if (n == 0)
        return 1;

    int digit = 0;

    while (n != 0)
    {
        digit++;
        n /= 10;
    }

    return digit;
}
void convertintoArray(int *array, int n, int noOfdigit)
{
    int i = 0;
    while (n != 0)
    {
        int digit = n % 10;
        array[i++] = digit;
        n /= 10;
    }
}
void sort(int *arr, int n)
{
    int min = 0;
    for (int i = 0; i < n; i++)
    {
        min = i;
        for (int j = i; j < n; j++)
        {
            if (arr[min] > arr[j])
                min = j;
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
int convertToLargestNumber(int *arr, int noOfDigit)
{
    int number = 0;
    for (int i = noOfDigit - 1; i >= 0; i--)
    {
        number = number * 10 + arr[i];
    }
    return number;
}

int largestNumber(int n)
{
    if (n == 0)
        return 0;

    int noOfDigit = getNumberOfDigits(n);

    int array[noOfDigit];

    convertintoArray(array, n, noOfDigit);

    sort(array, noOfDigit);

    return convertToLargestNumber(array, noOfDigit);
}
int main()
{

    cout << largestNumber(8573009);

    return 0;
}