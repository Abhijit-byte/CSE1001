package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt() ;
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt() ;
        System.out.print("Enter the third number : ");
        int n3 = sc.nextInt() ;
        int sum = 0 ;
        for (int i = n1 ; i <= n2 ; i+=n3) {
            System.out.print(i + "  ");
            sum += i ;
        }
        System.out.println("The sum of the number displayed is " + sum);

    }
}
