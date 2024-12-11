/*
Write a java program that prints the sum of two random integers between 1 and 6 (such as
you might get when rolling dice)
 */

public class icp_cla_q3 {
    public static void main(String[] args) {
        int max = 6 , min = 1 , a  , b ;
        a = min + (int)(Math.random()  * (max - min + 1)) ;
        b = min + (int)(Math.random()  * (max - min + 1));
        System.out.println("First Number = " + a );
        System.out.println("Second Number = "  + b );
        System.out.println("Sum = " + (a + b));

    }
}
