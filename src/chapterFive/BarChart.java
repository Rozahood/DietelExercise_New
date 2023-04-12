package chapterFive;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
        This program accepts five different numbers
        Enter the first number:
        """);
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.println("Enter the fifth number: ");
        int fifthNumber = input.nextInt();

       if (firstNumber > 30){
           System.out.println("You are not wise!");
       }else {
           generateStarsFor(firstNumber);
           System.out.println();
       }

        if (secondNumber > 30){
            System.out.println("You are not wise!");
        }else {
            generateStarsFor(secondNumber);
            System.out.println();
        }

        if (thirdNumber > 30){
            System.out.println("You are not wise!");
        }else {
            generateStarsFor(thirdNumber);
            System.out.println();
        };

        if (fourthNumber > 30){
            System.out.println("You are not wise!");
        }else {
            generateStarsFor(fourthNumber);
            System.out.println();
        }

        if (fifthNumber > 30){
            System.out.println("You are not wise!");
        }else {
            generateStarsFor(fifthNumber);
            System.out.println();
        }

    }
    private static void generateStarsFor(int userInput) {
            for (int i = 0; i < userInput; i++) {
                System.out.print("* ");
            }
    }
}
