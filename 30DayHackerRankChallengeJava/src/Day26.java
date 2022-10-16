import java.util.*;
import java.util.concurrent.TimeUnit;

public class Day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int returnDay = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();

        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        Date returnDate = new GregorianCalendar(returnYear, returnMonth - 1, returnDay).getTime();
        Date dueDate = new GregorianCalendar(dueYear, dueMonth - 1, dueDay).getTime();

        long difference = TimeUnit.DAYS.convert(returnDate.getTime() - dueDate.getTime(), TimeUnit.MILLISECONDS);
        int monthDiff = returnMonth - dueMonth;

        if (difference <= 0) System.out.println(0);
        else if (returnMonth == dueMonth) System.out.println(15 * difference);
        else if (returnYear == dueYear) System.out.println(500 * monthDiff);
        else System.out.println(10000);
    }
}