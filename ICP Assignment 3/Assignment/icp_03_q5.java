import java.util.Scanner;

public class icp_03_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year = ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year : true");
        } else {
            System.out.println(year + " is a leap year : false");
        }
    }
}