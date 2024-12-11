/*
Write a java program to take three inputs from command line argument as principle, rate and
time. Find Simple interest.
 */

public class icp_ha_cla_q1 {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]) ;
        double r = Double.parseDouble(args[1]) ;
        double t = Double.parseDouble(args[2]) ;
        double si = (p * r * t) / 100 ;
        System.out.println("Simple Interest = " + si);
    }
}
