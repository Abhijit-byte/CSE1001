package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the base : ");
        int b = sc.nextInt() ;
        System.out.println("Enter the power : ");
        int p = sc.nextInt( );
        int product = 1 ;
        for (int i = 1 ; i <= p ; i++) {
            product *= b;
        }
        System.out.println(b + " to the power " + p + " is : " + product);
    }
}
