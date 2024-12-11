package MidSemPracticeQyestion;

public class ques_04_ha_01 {
    public static void main(String[] args) {
        int sumsq = 0, sqsum = 0, sum = 0;
        for (int i = 1; i <= 10; i++) {
            sumsq += (int) Math.pow(i, 2);
            sum += i;
        }
        sqsum = (int) Math.pow(sum, 2);
        int diff = Math.abs(sqsum - sumsq);
        System.out.println("The sum of the squares of the first ten natural numbers is : " + sumsq);
        System.out.println("The square of the sum of the first ten natural natural numbers is : " + sqsum);
        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is " + sumsq + " - " + sqsum + " = " + diff);
    }
}


