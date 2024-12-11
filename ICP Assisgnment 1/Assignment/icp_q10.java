/*
Q.10   Assume a string variable ruler1 contains "1" initially ie String ruler1 = "1" . Write a java program
       to print the following output using string concatenation (You can take extra string variable)

 */

public class icp_q10 {
    public static void main(String[] args) {
        String ruler1 = " 1 " ;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 2 " + ruler1 ;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 3 " + ruler1 ;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 4 " + ruler1;
        System.out.println(ruler1);

    }
}
