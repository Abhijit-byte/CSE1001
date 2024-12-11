import java.util.Scanner;

public class icp_03_ha_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        System.out.println("What is your gender (M or F) : ");
        char gender = sc.next().charAt(0) ;
        if (gender == 'F') {
            System.out.println("First name : ");
            String firstName = sc.next() ;
            System.out.println("Last name : ");
            String lastName = sc.next() ;
            System.out.println("Age : ");
            int age = sc.nextInt();
            if (age >= 20) {
                System.out.println("Are you married , " + firstName + " (y or n) ? ");
                char choice = sc.next().charAt(0);
                switch (choice) {
                    case 'y':
                        System.out.println("Then i shall call you Mrs. " + firstName + " " + lastName + " .");
                        break;
                    case 'n':
                        System.out.println("Then i shall call you Ms. " + firstName + " " + lastName + " .");
                        break;
                    default:
                        System.out.println("Invalid Input !");
                }
            }
            else {
                System.out.println("Then i shall call you " + firstName + " " + lastName + " .");
            }
        }
        else if (gender == 'M') {
            System.out.println("First name : ");
            String firstName = sc.next() ;
            System.out.println("Last name : ");
            String lastName = sc.next() ;
            System.out.println("Age : ");
            int age = sc.nextInt();
            if (age >= 20) {
                System.out.println("Then i shall call you Mr. " + firstName + " " + lastName + " .");
            } else {
                System.out.println("Then i shall call you " + firstName + " " + lastName + " .");
            }
        }
        else {
            System.out.println("Invalid Input ");
        }
        sc.close();

    }
}
