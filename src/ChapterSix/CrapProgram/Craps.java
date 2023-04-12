package ChapterSix.CrapProgram;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);
        final SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Let's play craps!" + "Press enter to roll the dice....");

        in.nextLine();
        int roll1 = d1.roll();
        int roll2 = d2.roll();
        int rollTotal= roll1 + roll2;

        System.out.println("You rolled a " + roll1 + "and a " + roll2);
        System.out.println("Your total is " + rollTotal);
    }
}
