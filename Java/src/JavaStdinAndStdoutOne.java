package JavaStdinAndStdoutOne;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(scan.nextInt());
        }
        scan.close();
    }
}