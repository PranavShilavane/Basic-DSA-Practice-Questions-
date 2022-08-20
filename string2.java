/*

Roman Number to Integer

Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.

I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3
Your Task:

Complete the function romanToDecimal() which takes a string as input parameter and returns the equivalent decimal number. 


 */

public class string2 {

    public static int characterToInteger(char ch) {

        int valueOfInt = 0;
        switch (ch) {
            case 'I':
                valueOfInt = 1;
                break;
            case 'V':
                valueOfInt = 5;
                break;
            case 'X':
                valueOfInt = 10;
                break;
            case 'L':
                valueOfInt = 50;
                break;
            case 'C':
                valueOfInt = 100;
                break;
            case 'D':
                valueOfInt = 500;
                break;
            case 'M':
                valueOfInt = 1000;
                break;

        }

        return valueOfInt;
    }

    public static int romanToDecimal(String ch) {

        int n = ch.length();

        int value = 0;

        int i = 0;

        while (true) {
            if (i < n)
                value += characterToInteger(ch.charAt(i));
            else
                break;

            i++;
        }

        return value;
    }

    public static void main(String[] args) {

        String ch = "XVIIII";

        System.out.println(romanToDecimal(ch));

    }

}
