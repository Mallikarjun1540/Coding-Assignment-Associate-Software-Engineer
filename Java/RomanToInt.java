package associate_software;

import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Eneter the Roman number : ");
        String roman = scan.next();
        int result = romanToInteger(roman);
        System.out.println("Roman number " + roman + " is equivalent to integer " + result);
    }
    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int numericValue = 0;
            switch (currentChar) {
                case 'I':
                    numericValue = 1;
                    break;
                case 'V':
                    numericValue = 5;
                    break;
                case 'X':
                    numericValue = 10;
                    break;
                case 'L':
                    numericValue = 50;
                    break;
                case 'C':
                    numericValue = 100;
                    break;
                case 'D':
                    numericValue = 500;
                    break;
                case 'M':
                    numericValue = 1000;
                    break;
                default:
                    return -1;
            }
            if (numericValue < prevValue) {
                result -= numericValue;
            } else {
                result += numericValue;
            }
            prevValue = numericValue;
        }
        return result;
    }
}
