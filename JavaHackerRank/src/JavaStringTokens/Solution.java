package JavaStringTokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        String[] words = s.split("[ !,?._'@\\s]+");
        if (s.isEmpty()) System.out.println(0);
        else {
            System.out.println(words.length);
            for (String token : words) {
                System.out.println(token);
            }
        }
    }
}