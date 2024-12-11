package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        int result = 0, i = 0;
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            if (r != 0) {
                result = result + (int) (r * Math.pow(10, i));
                i++;
            }
            temp = temp / 10;
        }
        System.out.println("After removing 0 from the number " + n + " the new number is " + result);
    }
}

