import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        Solution 1
//        int count = 0;
//        while (n != 0) {
//            n = (n & (n << 1));
//            count++;
//        }
//        System.out.println(count);
//        Solution 2
        System.out.println(Arrays.stream(Integer.toBinaryString(n).split("0")).map(String::length).max(Integer::compareTo).get());

        scanner.close();
    }
}
