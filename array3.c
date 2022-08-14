/*
Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

Example 1:

Input:
S = 00001

Output:
4

Explanation:
Last index of  1 in given string is 4.

*/

#include <stdio.h>
#include <string.h>
int main()
{
    char ch[] = "1000";

    for (int i = strlen(ch) - 1; i >= 0; i--)
        if (ch[i] == '1')
        {
            printf("%d", i);
            return 0;
        }

    return 0;
}
