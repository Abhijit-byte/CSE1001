/*
Q.7   Write a java program to exchange the values of two variables of the integer type x and y using
      third temporary variables z .
 */

import java.util.Scanner;

public class icp_q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping x and y , x = " + x + " and y = " + y );
        int z = x ;
        x = y ;
        y = z ;
        System.out.println("After Swapping x and y , x = " + x + " and y = " + y );
        sc.close();

    }
}
