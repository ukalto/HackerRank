package JavaAnagrams;

import java.util.Locale;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        char[] chara = a.toLowerCase().toCharArray();
        char[] charb = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(chara);
        java.util.Arrays.sort(charb);
        return java.util.Arrays.equals(chara, charb);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
