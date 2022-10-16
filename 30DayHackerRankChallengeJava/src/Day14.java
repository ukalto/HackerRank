import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;


class Day14 {
    private int[] elements;
    public int maximumDifference;

    public Day14(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
//    Solution 1
    void computeDifference() {
        int max = Arrays.stream(elements).max().orElse(0);
        int min = Arrays.stream(elements).min().orElse(0);
        maximumDifference = max - min;
    }
//    Solution 2
//    void computeDifference() {
//        int max = IntStream.of(elements).max().orElse(0);
//        int min = IntStream.of(elements).min().orElse(0);
//        maximumDifference = max - min;
//    }

} // End of Difference class

class Solution14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Day14 difference = new Day14(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}