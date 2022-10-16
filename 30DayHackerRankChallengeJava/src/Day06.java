import java.io.*;
import java.util.*;

public class Day06 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            String evenString = "";
            String oddString = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) evenString += s.charAt(j);
                else oddString += s.charAt(j);
            }
            System.out.format("%s %s\n", evenString, oddString);
        }
    }
}