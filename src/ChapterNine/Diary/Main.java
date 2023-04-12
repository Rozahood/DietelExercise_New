//package ChapterNine;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    private static Diary diary = new Diary();
//    private static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        Entry entry = new Entry();
//
//
//         System.out.println("Welcome my Diary!");
//         System.out.println("""
//            What do wish to do?
//            1. Create Entry;
//            2. view Entry;
//            3. Delete Entry;
//            4. Edit Entry;
//         """);
//         System.out.print("Reply: ");
//         int userInput = input.nextInt();
//
//         switch (userInput){
//             case 1 -> createEntry();
//             case 2 -> viewEntry();
//             case 3 -> deleteEntry();
//             case 4 -> editEntry();
//         }
//    }
//
//    private static void createEntry() {
//        System.out.println("Enter title: ");
//        String title = input.nextLine();
//        System.out.println("Enter entry body: ");
//        String
//        diary.createEntry();
//    }
//
//    private static void viewEntry() {
//        System.out.println(Entry title);
//    }
//
//    private static void editEntry() {
//    }
//
//    private static void deleteEntry() {
//    }
//}