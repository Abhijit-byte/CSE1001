package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number : ");
        int n = sc.nextInt() ;
        int result = 1 ;
        while(result*3 <= n) {
            result *= 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + result );

    }
}
