/* 
 
Implement Atoi

Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123

Output: 123

Example 2:

Input:
str = 21a

Output: -1

Explanation: Output is -1 as all
characters are not digit only.

*/






public class string5 {
    public static int characterToInteger(char i) {
        switch (i) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case '0':
                return 0;
            default:
                return -1;
        }
    }

    static int atoi(String str) {

        int digit = 0;
        for (int i = 0; i < str.length(); i++) {

            if (characterToInteger(str.charAt(i)) == -1)
                return -1;

            digit = digit * 10 + characterToInteger(str.charAt(i));
        }

        return digit;
    }

    public static void main(String[] args) {

        String number = "173";

        if (atoi(number) != -1)
            System.out.println("Number : " + atoi(number));
        else
            System.out.println("Cannot convert to number...");

    }
}