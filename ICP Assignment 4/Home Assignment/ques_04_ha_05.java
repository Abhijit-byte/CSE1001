package MidSemPracticeQyestion;

import java.util.Scanner;

public class ques_04_ha_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For input n = ");
        int n = sc.nextInt();
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + " " + i + " " + s;
            System.out.println(s);
        }
    }
}

