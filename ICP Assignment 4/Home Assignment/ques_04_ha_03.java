package MidSemPracticeQyestion;

public class ques_04_ha_03 {
    public static void main(String[] args) {
        for (int i = 1000 ; i <= 2000 ; i++) {
            System.out.print(i + "  ");
            if ((i+1) % 5 == 0 ) {
                System.out.println();
            }
        }
    }
}
