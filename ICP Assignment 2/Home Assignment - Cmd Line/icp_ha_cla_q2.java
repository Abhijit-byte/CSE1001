/*
The surface area of a cylinder can be defined as A= πr2+2πrh, where r and h are the radius
height of the cylinder respectively. Write a java program to find the area where r and h are
inputted from command line argument. Hint: Use Math.PI.

 */

public class icp_ha_cla_q2 {
    public static void main(String[] args) {
        double r = 5;// Double.parseDouble(args[0]) ;
        double h = 2;// Double.parseDouble(args[1]) ;
        double A = (Math.PI * Math.pow(r, 2)) + (2 * Math.PI * h);
        System.out.println("The Surface Area of Cylinder : " + A);
    }
}
