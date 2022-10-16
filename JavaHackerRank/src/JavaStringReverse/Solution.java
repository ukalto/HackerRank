package JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
//        Solution 1
//        String str = "Yes";
//        for (int l = 0, h = a.length() - 1; l < s.length() / 2; l++, h--) {
//            if (s.charAt(l) != s.charAt(h)){
//                str = "No";
//                break;
//            }
//        }
//        System.out.println(str);
//        Solution 2
        if (s.equals(new StringBuffer(s).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}