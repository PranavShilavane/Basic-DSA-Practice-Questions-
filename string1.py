'''

Given two strings denoting non-negative numbers X and Y. Calculate the sum of X and Y.

Example 1:

Input:
X = "25", Y = "23"
Output:
48
Explanation:
The sum of 25 and 23 is 48.
Example 2:

Input:
X = "2500", Y = "23"
Output:
2523
Explanation:
The sum of 2500 and 23 is 2523.

'''

def findSum(a, b):
    return int(a)+int(b)


X = "25"
Y = "23"

print(findSum(X,Y))