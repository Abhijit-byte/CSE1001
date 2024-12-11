/*
Q.8   Write a java program to exchange the values of two variables of integer type x and y without
      using third temporary variable .
 */

import java.util.Scanner;

public class icp_q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping x and y , x = " + x + " and y = " + y );
        x = x + y ;
        y = x - y ;
        x = x - y ;
        System.out.println("After Swapping x and y , x = " + x + " and y = " + y );
        sc.close();
    }
}

