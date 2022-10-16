import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
//        Solution 1
//        int maxSum = Integer.MIN_VALUE;
//        int[][] filterArr = new int[][]{{1, 1, 1}, {0, 1, 0}, {1, 1, 1}};
//        for (int i = 0; i <= arr.length - filterArr.length; i++) {
//            for (int j = 0; j <= arr[0].length - filterArr[0].length; j++) {
//                int sum = 0;
//                for (int k = 0; k < filterArr.length; k++) {
//                    for (int l = 0; l < filterArr[k].length; l++) {
//                        sum += (filterArr[k][l] * arr[i + k][j + l]);
//                    }
//                }
//                if (maxSum < sum) {
//                    maxSum = sum;
//                }
//            }
//        }
//        System.out.println(maxSum);
//        Solution 2
        List<Integer> curr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                curr.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2]);
            }
        }
        System.out.println(curr.stream().max(Integer::compare).get());

        scanner.close();
    }
}
