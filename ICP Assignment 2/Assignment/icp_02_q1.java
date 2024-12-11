/*
Write a java program that reads a Fahrenheit degree in a double value from the console, then
converts it to Celsius and displays the result. The formula for the conversion is as follows:
Celsius = (Fahrenheit-32) *(5/9)
*/

import java.util.Scanner;

public class icp_02_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature of the surrounding in Fahrenheit :");
        double f = sc.nextDouble();
        double c = (f - 32) * (5.0 / 9);
        System.out.println(f + " Fahrenheit is equal to " + c + " Celsius");
    }
}
