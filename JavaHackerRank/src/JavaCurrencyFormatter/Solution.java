package JavaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

//    Solution 1
//    static String printCurrency(Locale locale, double payment) {
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
//        return formatter.format(payment);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        // Write your code here
//        Locale indiaLocale = new Locale("en", "IN");
//
//        System.out.println("US: " + printCurrency(Locale.US, payment));
//        System.out.println("India: " + printCurrency(indiaLocale, payment));
//        System.out.println("China: " + printCurrency(Locale.CHINA, payment));
//        System.out.println("France: " + printCurrency(Locale.FRANCE, payment));
//    }
//}
//  Solution 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}