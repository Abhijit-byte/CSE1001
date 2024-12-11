/*
Write a java program to input a character from command line and display the ASCII value of
the entered character.

 */

public class icp_cla_q6 {
    public static void main(String[] args) {
        char c = args[0].charAt(0);
        System.out.println("The ASCII value of " + c + " = " + (int) c);
    }

}
