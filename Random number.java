package homework3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);
        double sub = number1 - number2;
        System.out.println("Whatis the result of" + number1 + "-" + number2 + "?");
        double useranswer = input.nextDouble();
        if (sub == useranswer)
            System.out.println("Your answer is correct");
            else 
            System.out.println("your answer is wrong");

    }
}
