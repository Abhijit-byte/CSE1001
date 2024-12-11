import java.util.Scanner;

public class icp_03_q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter three Integer Numbers : ");
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int c = sc.nextInt() ;
        int largest , secondLargest ;
        if (a >= b && a >= c ) {
            largest = a;
            secondLargest = (b >= c) ? b : c;
        }
        else if (b >= a && b >= c)  {
            largest = b ;
            secondLargest = (a >= c ) ? a : c ;
        }
        else {
            largest = c ;
            secondLargest = (a >= b ) ? a : b ;
        }
        System.out.println("Largest Number = " + largest);
        System.out.println("Second Largest Number = " + secondLargest);
        sc.close();
    }
}
