import java.util.Scanner;

public class icp_03_ha_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Today's Day : ");
        int tod = sc.nextInt();
        System.out.print("Enter the Number of Days elapsed since today : ");
        int elapsed = sc.nextInt();
        int future = (tod + elapsed) % 7;
        System.out.print("Today is ");
        switch (tod) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
        }
        System.out.print(" and the future day is ");
        switch (future) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
        }

    }
//    public static void dDay(int day) {
//        switch(day) {
//            case 0:
//                System.out.print("Sunday");
//                break;
//            case 1:
//                System.out.print("Monday");
//                break;
//            case 2:
//                System.out.print("Tuesday");
//                break;
//            case 3:
//                System.out.print("Wednesday");
//                break;
//            case 4:
//                System.out.print("Thursday");
//                break;
//            case 5:
//                System.out.print("Friday");
//                break;
//            case 6:
//                System.out.print("Saturday");
//                break;
//        }
}
