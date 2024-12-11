import java.util.Scanner;

public class icp_03_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter the ml of water Alice drank today = ");
        int x = sc.nextInt() ;
        if(x >= 5000) {
            System.out.println("\"Yes, Alice is following doctor's advice\"");
        }
        else {
            System.out.println("\"No, Alice is not following doctor's advice\"");
        }
    }
}
