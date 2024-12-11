/*
Enter the basic salary of an employee of an organization through the keyboard. His dearness
allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
salary.
 */

import java.util.Scanner;

public class icp_02_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the basic salary of an employee : ");
        double bs = sc.nextDouble() ;
        double da = 0.4 * bs , hra = 0.2 * bs ;
        double gross = bs + da + hra ;
        System.out.println("DA = " + da + "\nHRA = " + hra + "\nGross Salary = " + gross );

    }
}
