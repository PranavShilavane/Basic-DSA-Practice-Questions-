/*
 
Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

Example 1:

Input:
str = 101

Output:
1

Explanation:
Since string contains only 0 and 1, output is 1.

Example 2:

Input:
str = 75

Output:
0

Explanation:
Since string contains digits other than 0 and 1, output is 0.

*/

public class string3 {

    public static boolean isBinary(String str) {

        for (int i = 0; i < str.length(); i++)
            if (!(str.charAt(i) == '0' || str.charAt(i) == '1'))
                return false;

        return true;
    }

    public static void main(String[] args) {

        String str = "1010101";

        System.out.println(isBinary(str));
    }
}
