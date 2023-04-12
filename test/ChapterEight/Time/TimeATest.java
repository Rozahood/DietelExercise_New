package ChapterEight.Time;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeATest {
    static Scanner scanner = new Scanner(System.in);
    public static int input(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        TimeA time = new TimeA();

        int hour =input("Imput Hour");
        int minute = input("Imput minute");
        int second = input("Imput Second");

        displayTime("After time has been created", time);
        System.out.println();

        time.setTime(hour,minute,second);
        displayTime("After calling set Time", time);

        try{
            time.setTime(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception message %s%n%n", e.getMessage());

        }


    }

    private static void displayTime(String header, TimeA t){
        System.out.printf("%s%n Universal Time: %s%n Standard Time: %s%n", header, t.toUniversalString(),t.toString());

    }

}