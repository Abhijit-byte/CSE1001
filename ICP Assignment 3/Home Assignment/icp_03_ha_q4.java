import java.util.Scanner;

public class icp_03_ha_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter an Integer : ");
        int n = sc.nextInt() ;
        boolean and = (n % 5 == 0 ) && (n % 6 == 0 )  ;
        boolean or = (n % 5 == 0 ) || (n % 6 == 0 ) ;
        // ^ operator is the xor operator which also means that " this or that but not both "
        boolean xor = (n % 5 == 0 ) ^ (n % 6 == 0 ) ;
        System.out.println("Is " + n + " divisible by 5 and 6 ? " + and );
        System.out.println("Is " + n + " divisible by 5 or 6 ? " + or );
        System.out.println("Is " + n + " divisible by 5 or 6 , but not both ? " + xor );
    }
}
