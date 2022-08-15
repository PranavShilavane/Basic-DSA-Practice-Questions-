'''
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789

'''

A = [3, 2, 1, 56, 10000, 167]

size = 6

min = 0
max = 0

for i in range(size):
    if(A[i] > A[max]):
        max = i
    if(A[i] < A[min]):
        min = i

print("min = ", A[min])
print("max = ", A[max])
