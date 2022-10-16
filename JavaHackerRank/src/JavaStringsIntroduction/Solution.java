package JavaStringsIntroduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s = "";
        if (a.compareTo(b) > 0) s = "Yes";
        else s = "No";
        System.out.printf(
                "%s\n%s\n%s %s",
                a.length() + b.length(),
                s,
                a.substring(0, 1).toUpperCase() + a.substring(1),
                b.substring(0, 1).toUpperCase() + b.substring(1)
        );
    }
}