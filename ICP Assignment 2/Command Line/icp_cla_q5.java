/*
Write a java program that takes three int values from the command line and prints them in
ascending order. Use Math.min() and Math.max().

 */

 public class icp_cla_q5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]) ;
        int b = Integer.parseInt(args[1]) ;
        int c = Integer.parseInt(args[2]) ;
        int min = Math.min(Math.min(a , b) , c) ;
        int max = Math.max(Math.max(a , b) , c ) ;
        int mid = a + b + c - min - max ;
        System.out.println("The input in Command Line = " + a + " , " + b + " , " + c) ;
        System.out.println("Output in ascending order = " + min + " , " + mid + " , " + max ) ;
    }
}
