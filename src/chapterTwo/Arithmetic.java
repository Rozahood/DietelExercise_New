package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        int firstNumberSquare = firstNumber * firstNumber;
        int secondNumberSquare = secondNumber * secondNumber;
        System.out.println("These are the squares if your numbers! " + firstNumberSquare + " and " + secondNumberSquare);

        int sum = firstNumberSquare + secondNumberSquare;
        System.out.println("These is the sum of the square values! " + sum);
        int difference = firstNumberSquare - secondNumberSquare;
        System.out.println("This is the difference between your values  " + difference);
    }
}
