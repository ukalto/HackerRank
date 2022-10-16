import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int save = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = save;
                    count++;
                }
            }
        }
        System.out.printf("Array is sorted in %s swaps.\n", count);
        System.out.printf("First Element: %s\n", a[0]);
        System.out.printf("Last Element: %s\n", a[a.length - 1]);
    }
}