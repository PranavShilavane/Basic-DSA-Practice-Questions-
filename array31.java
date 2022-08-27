/*
 
Parenthesis Checker

Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}

Output: 
true

Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.

Example 2:

Input: 
()

Output: 
true

Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.

Example 3:

Input: 
([]

Output: 
false

Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.

 */

public class array31 {

    public static boolean ispar(String text) {

        int n = text.length();

        int k = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int i = 0, j = n - 1; i < k; i++, j--)
            if ((text.charAt(i) == '(' && text.charAt(j) == ')') || (text.charAt(i) == '[' && text.charAt(j) == ']')
                    || (text.charAt(i) == '{' && text.charAt(j) == '}'))
                continue;
            else
                return false;

        return true;

    }

    public static void main(String[] args) {

        String text = "({}])";

        System.out.println(ispar(text));

    }
}