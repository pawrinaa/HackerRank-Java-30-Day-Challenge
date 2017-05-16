import java.util.*;

/**
 * Created by phuphuberry on 5/15/2017.
 */

public class Java_Day_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < 11; i++){
            int x = n*i ;
            System.out.println(n + " x " + i + " = " + x);
        }
    }
}