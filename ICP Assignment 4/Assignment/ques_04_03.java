package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number : ");
        int N = sc.nextInt() ;
        double sum = 0.0 ;
        System.out.print("Random numbers generated are : ");
        int temp = N ;
        do {
            int comp = 1 + (int)(Math.random()*temp) ;
            System.out.print(comp + " ");
            sum += comp;
            temp-- ;
        }
        while(temp != 0) ;
        double avg = sum / N ;
        System.out.println("\nAverage of " + N + " random numbers = " +avg);
    }
}
