
/*
 
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"

Output: "zvo"

Explanation: Only keep the first
occurrence

Example 2:

Input: S = "gfg"

Output: gf

Explanation: Only keep the first
occurrence

Your task:
Your task is to complete the function removeDups() which takes a single string as input and returns the string. You need not take any input or print anything.

 */

public class string4 {
    public static String removeDups(String newStr) {

        String str = newStr;

        for (int i = 0; i < str.length() - 1; i++)
            for (int j = i + 1; j < str.length() - 1; j++)
                if (str.charAt(i) == str.charAt(j))
                    str = str.replace(str.charAt(i), '\0');

        return str;
    }

    public static void main(String[] args) {
        String str = "Pranav";

        System.out.println(removeDups(str));

    }

}
