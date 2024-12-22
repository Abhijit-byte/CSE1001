import java.util.Scanner;

public class icp_03_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of units consumed : ") ; 
        int unit = sc.nextInt();
        double r = 0.0 ;
        if (unit <= 50) {
            r = unit * 3.0 ;
        }
        else if (unit <= 200) {
            r = (50 * 3.0) + (unit - 50) * 4.80 ;
        }
        else if (unit <= 400) {
            r = (50 * 3.0) + (150 * 4.80) + (unit - 200) * 5.80;
        }
        else {
            r = (50 * 3.0) + (150 * 4.80) + (200*5.80) + (unit - 400) * 6.20 ;
        }
        System.out.println("Amount Payable = " + r );
        sc.close();
    }
}
