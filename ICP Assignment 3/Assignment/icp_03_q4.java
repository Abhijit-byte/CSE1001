import java.util.Scanner;

public class icp_03_q4 {
    public static void main(String[] args) {
        int min = 1 , max = 9 ;
        int comp = min + (int)(Math.random() * (max - min + 1)) ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter User number = ");
        int user = sc.nextInt() ;
        System.out.println("Computer guesses = " + comp);
        if (user == comp) {
            System.out.println("\"You got it right\"");
        }
        else if (Math.abs(user - comp) == 1) {
            System.out.println("\"Almost got it\"");
        }
        else {
            System.out.println("\"You got it wrong\"");
        }
    }
}
