import java.util.Scanner;

public class icp_03_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the age of a person = ");
        int age = sc.nextInt();
        if (age >= 18 ) {
            System.out.println("\"You are eligible to cast your vote\"");
        }
    }
}
