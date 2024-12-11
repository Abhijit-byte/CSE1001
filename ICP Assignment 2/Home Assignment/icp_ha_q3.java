/*
Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
a triangle and displays its area. The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area= √(𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐))
 */

import java.util.Scanner;

public class icp_ha_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three points for a triangle : ");
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, area;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        // side can be calculated using the distance formula : √((x2 - x1)^2 + (y2 -
        // y1)^2)
        side1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        side2 = Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)));
        side3 = Math.sqrt((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2)));
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the Triangle is : " + area);
        sc.close();

    }
}
