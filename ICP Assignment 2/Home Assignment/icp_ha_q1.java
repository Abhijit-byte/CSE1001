/*
Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
 */

import java.util.Scanner;

public class icp_ha_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of minutes : ");
        int m = sc.nextInt() ;
        int y = m / (365*24*60) ;
        int r = m % (365*24*60) ;
        int d = r / (24*60) ;
        System.out.println(m + " minutes is approximately = " + y + " years and " + d + " days !" );
    }
}
