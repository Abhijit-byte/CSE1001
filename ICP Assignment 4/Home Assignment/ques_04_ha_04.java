package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_ha_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("For input n = ");
        int n = sc.nextInt() ;
        int sum = 0 , product = 1 ;

        for (int i = 1 ; i <= n ; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                product *= i;

            }
        }
        System.out.println("Sum of all Even Numbers = " + sum );
        System.out.println("Product of all Odd Numbers = " + product );
    }
}
