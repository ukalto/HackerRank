package JavaArraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList[] ints = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ints[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                ints[i].add(scanner.nextInt());
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(ints[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}