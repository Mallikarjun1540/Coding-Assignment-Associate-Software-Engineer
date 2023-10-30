package associate_software;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Eneter the  Input String : ");
        String input = scan.next();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean letterSeen : alphabet) {
            if (!letterSeen) {
                return false; 
            }
        }
        return true;
    }
}
