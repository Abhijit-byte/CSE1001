/*
The distance between two cities (in km.) is input through the keyboard. Write a java program
to convert and print this distance in meters, feet, inches and centimetres.
Hint:
1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch,
1km= 100000 centimetre
 */

import java.util.Scanner;

public class icp_02_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter the distance between the two cities : ");
        double km = sc.nextDouble() ;
        System.out.println(km + " km is " + (km*1000) + " meters ");
        System.out.println(km + " km is " + (km*3280.8399) + " feet ");
        System.out.println(km + " km is " + (km*39370.0787) + " inch ");
        System.out.println(km + " km is " + (km*100000) + " centimeters ");
    }
}
