import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rdm = new Random();

        String[] symbol = {"+", "-", "*", "/"};

        int correct = 0;
        int answered = 0;

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

        while (true) {

            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();

            int index = rdm.nextInt(4);
            String operator = symbol[index];

            Fraction answer;

            if (operator.equals("+")) {
                answer = f1.add(f2);
            } else if (operator.equals("-")) {
                answer = f1.subtract(f2);
            } else if (operator.equals("*")) {
                answer = f1.multiply(f2);
            } else {
                answer = f1.divide(f2);
            }

            System.out.print(f1 + " " + operator + " " + f2 + " = ");
            String input = in.nextLine();

            if (input.subString().equals("quit")) {
                break;
            }

            answered++; 

            if (answer.subString().equals(input)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong, the answer was " + answer);
            }
            System.out.println();
        } 

        if (answered == 0) {
            System.out.println("You didn't answer any questions.");
        } else {
            int a = correct;
            int b = answered;
            while (b != 0) {
                int hold = b;
                b = a % b;
                a = hold;
            }
            int c = a;

            Fraction score = new Fraction(correct / c, answered / c);
            int percent = (int) Math.round(100.0 * correct / answered);
            System.out.println("You answered " + score + " correctly, for a score of " + percent + " percent!");
        }

    }
}
