import java.util.*;

/**
 * Created by phuphuberry on 4/25/2017.
 */
public class Java_Day_1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        int j = scan.nextInt();
        double e = scan.nextDouble();
        String t  = scan.next();
        String u = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println (i + j);

        /* Print the sum of the double variables on a new line. */
        System.out.println (d + e);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println (s + t + u);

        scan.close();
    }
}
