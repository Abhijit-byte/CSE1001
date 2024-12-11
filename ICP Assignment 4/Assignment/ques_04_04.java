package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();
        int r;
        do {
            r = x % y;
            x = y;
            y = r;
        }
        while (r != 0);
        System.out.println("GCD of the two numbers = " + x);


    }
}
