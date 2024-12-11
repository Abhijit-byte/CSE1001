/*
Write a java program that takes a double value t from the command line and prints the value
of cos (5t) + sin (7t). Use Math.cos() and math.sin(
 */

public class icp_cla_q4 {
    public static void main(String[] args) {
        // double t = Double.parseDouble(args[0]);
        double t = 5.2;
        t = Math.toRadians(t);
        double r = Math.cos(5 * t) + Math.sin(7 * t);
        System.out.println("cos(5t) + sin(7t) = " + r);
    }

}