package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int user = 0 , comp = 1 ;
        while(user != comp) {
            comp = 1 + (int) (Math.random() * 10);
            System.out.println("Enter a number between 1 and 10 : ");
            user = sc.nextInt();
            System.out.println("Computer's guess : " + comp);
            if (user == comp) {
                System.out.println("Good Guess !");
            } else if (user > comp) {
                System.out.println("Too high , try again !");
            } else {
                System.out.println("Too low , try again !");
            }
        }

    }
}
