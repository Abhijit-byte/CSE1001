import java.util.Scanner;

public class icp_03_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int x = sc.nextInt() ;
        System.out.print("Input second number : ");
        int y = sc.nextInt() ;
        System.out.print("Input third number : ");
        int z = sc.nextInt() ;
        if (x <= y && y <= z) {
            System.out.println("\"Increasing\"");
        }
        else if (x >= y && y >= z) {
            System.out.println("\"Decreasing\"");
        }
        else {
            System.out.println("\"Neither Increasing nor decreasing\"");
        }

    }
}
