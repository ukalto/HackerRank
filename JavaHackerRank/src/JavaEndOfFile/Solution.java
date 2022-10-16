package JavaEndOfFile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNextLine()) {
            System.out.printf("%s %s\n", counter, scanner.nextLine());
            counter++;
        }
        scanner.close();
    }
}