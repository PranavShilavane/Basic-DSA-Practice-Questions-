/*

Find a pair with the given sum in an array. Given an unsorted integer array, find a pair with the given sum in it

For example :

Input:
nums = [8, 7, 2, 5, 3, 1]
target = 10

Output :
Pair found

*/

#include <bits/stdc++.h>
using namespace std;
void findPair(int arr[], int target, int N)
{
    for (int i = 0; i < N - 1; i++)
        for (int j = 1 + 1; j < N - 1; j++)
            if (arr[i] + arr[j] == target)
            {
                cout << "Pair found";
                return;
            }

    cout << "Pair not found";
}

int main()
{
    int nums[] = {8, 7, 2, 5, 3, 1};

    findPair(nums, 10, sizeof(nums) / sizeof(nums[0]));

    return 0;
}