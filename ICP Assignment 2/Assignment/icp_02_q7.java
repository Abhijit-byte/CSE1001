/*
Write a java program that displays the following table. Cast floating-point numbers into
integers.
a   b   pow(a, b)
1   2   1
2   3   8
3   4   81
4   5   1024
5   6   15625

 */

public class icp_02_q7 {
    public static void main(String[] args) {
        int a = 1 , b = a + 1 ;
        System.out.println("a\t\tb\t\tpow(a,b)");
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));
        ++a ; ++b ;
        System.out.println(a + "\t\t" + b + "\t\t" + (int)Math.pow(a,b));


    }
}
