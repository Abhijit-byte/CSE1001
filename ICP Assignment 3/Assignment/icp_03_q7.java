import java.util.Scanner;

public class icp_03_q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number of units consumed : "):
        int unit = sc.nextInt();
        double r = 0.0 ;
        if (unit <= 50) {
            r = unit * 3.0 ;
        }
        else if (unit > 50 && unit <= 200) {
            r = (50 * 3.0) + (unit - 50) * 4.80 ;
        }
        else if (unit > 200 && unit <= 400) {
            r = (50 * 3.0) + (150 * 4.80) + (unit - 200) * 5.80;
        }
        else {
            r = (50 * 3.0) + (150 * 4.80) + (200*5.80) + (unit - 400) * 6.20 ;
        }
        System.out.println("Do you want to pay online(y/n)");
        char c = sc.next().charAt(0) ;
        if (c == 'y') {
            System.out.println("Total amount = " + r);
            double discount = 0.03 * r;
            System.out.println("Discount = " + discount);
            double pay = r - discount ;
            System.out.println("Amount payable = " + pay);
        }
        else if (c == 'n') {
            System.out.println("Total amount = " + r);
            double discount = 0.0;
            System.out.println("Discount = " + discount);
            double pay = r - discount;
            System.out.println("Amount payable = " + pay);
        }
        else {
            System.out.println("Invalid Input ! Enter Valid Input !");
        }
    }
}
