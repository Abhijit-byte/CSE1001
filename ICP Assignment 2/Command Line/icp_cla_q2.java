/*
Write a java program that takes two positive integers from command-line arguments and
prints the result of first number raise to the power of second number.

 */

public class icp_cla_q2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]) ;
        int n2 = Integer.parseInt(args[1]) ;
        int pv = (int)Math.pow(n1 , n2) ;
        System.out.println(n1 + " raised to the power of " + n2 + " = " + pv) ;
    }
}
