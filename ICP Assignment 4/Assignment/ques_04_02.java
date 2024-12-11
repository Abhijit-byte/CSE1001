package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number : ");
        int n = sc.nextInt() ;
        int temp = n , sum = 0;
        while(temp!= 0 ) {
            int r = temp % 10;
            sum += r;
            temp = temp / 10;
        }
        if (sum % 9 == 0 ) {
            System.out.println("The number " + n + " is divisible by 9.");
        }
        else {
            System.out.println("The number " + n + " is not divisible by 9 . ");
        }
    }
}
