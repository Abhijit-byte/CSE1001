import java.util.Scanner;

public class icp_03_ha_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Scissor(0) , Rock(1) and Paper(2) :  ");
        int user = sc.nextInt() ;
        int comp = (int)(Math.random() * 3) ;
        System.out.print("Computer's Choice : ");
        if (comp == 0 ) {
            System.out.println("Scissors");
        }
        else if (comp == 1) {
            System.out.println("Rock");
        }
        else {
            System.out.println("Paper");
        }
        System.out.print("User's Choice : ");
        if (user == 0) {
            System.out.println("Scissor");
        }
        else if (user == 1){
            System.out.println("Rock");
        }
        else if (user == 2){
            System.out.println("Paper");
        }
        else {
            System.out.println(user + "\nInvalid Choice ! Please Enter 0 , 1 or 2 . ");
            return ;
        }

        if (user == comp) {
            System.out.println("It's a draw !");
        }
        else if ((user == 1 && comp == 0  ) || (user == 0 && comp == 2) || (user == 2 && comp == 1 )) {
            System.out.println("Yay , You won !! Congratulations !!");
        }
        else {
            System.out.println("Sorry , You lost !! Try Again !");
        }
        sc.close();

    }
}
