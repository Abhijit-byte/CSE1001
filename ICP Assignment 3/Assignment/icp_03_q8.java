import java.util.Scanner;

public class icp_03_q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter x coordinate : ");
        int x = sc.nextInt();
        System.out.println("Enter y coordinate : ");
        int y = sc.nextInt() ;
        if (x == 0 && y == 0) {
            System.out.println("(" + x + " , " + y + ") is on the origin ");
        }
        else if (x == 0 && y != 0) {
            System.out.println("(" + x + " , " + y + ") is on the y-axis ");
        }
        else if (x != 0 && y == 0) {
            System.out.println("(" + x + " , " + y + ") is on the x-axis ");
        }
        else if (x > 0 && y > 0) {
            System.out.println("(" + x + " , " + y + ") is in the quadrant I ");
        }
        else if (x < 0 && y > 0) {
            System.out.println("(" + x + " , " + y + ") is in the quadrant II");
        }
        else if (x < 0 && y < 0) {
            System.out.println("(" + x + " , " + y + ") is in the quadrant III");
        }
        else if (x > 0 && y < 0) {
            System.out.println("(" + x + " , " + y + ")is in the quadrant IV ");
        }
        sc.close();
    }
}
