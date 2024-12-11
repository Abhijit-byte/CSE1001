/*
When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
distance it travels is given by d = (1/2) gt2
Here d is in feet, t is the time in seconds, and g is 32.174.
Write a program that asks the user for the number of seconds and then prints out the distance
travelled.

 */

import java.util.Scanner;

public class icp_02_q6 {
    public static void main(String[] args) {
        double g = 32.174;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in seconds : ");
        double t = sc.nextDouble();
        double d = (1.0 / 2) * g * Math.pow(t, 2);
        System.out.println("Distance Travelled = " + d);
        sc.close();

    }
}
