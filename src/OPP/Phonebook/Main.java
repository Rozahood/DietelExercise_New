package OPP.Phonebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main techno = new Main();
        techno.home();
    }
    Scanner input = new Scanner(System.in);
    private List dialedNumbers = new ArrayList<String>();
    private List froms = new ArrayList<String>();
    private List tos = new ArrayList<String>();
    private List messages = new ArrayList<String>();
    private List titles = new ArrayList<String>();

    private Dictionary dic = new Hashtable();

    public void home(){
        System.out.println("""
        Please enter a number
        1. -> Call History
        2. -> Message
        3. -> Contact
        """);
        int num = input.nextInt();
        switch (num){
            case 1 -> callHistory();
            case 2 -> message();
            case 3 -> contact();
        }
    }

    private void contact() {
        System.out.println("""
        1-> Add Contact
        2-> Show contact
        """);
        int num = input.nextInt();
        switch (num){
            case 1 -> addContact();
            case 2 -> showContact();
        }

    }

    private void showContact() {
        System.out.println(dic);
    }

    private void addContact() {
        System.out.println("Enter First name: ");
        String firstName = input.next();

        System.out.println("Enter Middle name: ");
        String middleName = input.next();

        System.out.println("Enter Surname: ");
        String surName = input.next();

        System.out.println("Enter Phone number: ");
        String phoneNumber = input.next();

        String fullName = surName + " " + firstName + " " + middleName;

        dic.put(phoneNumber, fullName);
        System.out.println();
        showContact();
        System.out.println();
        System.out.println();
        home();

    }

    private void message() {
        System.out.println("""
        1 -> Write message
        2 -> Sent messages
        """);
        int num = input.nextInt();
        switch (num){
            case 1-> writeMessage();
            case 2-> sentMessages();
        }

    }

    private void sentMessages() {
        System.out.println("""
        1. list of messages
        2. 
        """);
    }

    private void writeMessage() {
        System.out.println("From: ");
        String from = input.next();
        froms.add(from);
        System.out.println("To: ");
        String to = input.next();
        tos.add(to);
        System.out.println("Title: ");
        String title = input.next();
        titles.add(title);
        System.out.println("Write a message");
        StringBuilder stringBuilder;
        //
        // messages.add(message);
        System.out.println("Press 1 to go back to home");
        int back = input.nextInt();
        home();
    }

    private void callHistory() {
        System.out.println("""
        Please enter a number
        1. -> Dial a number
        2. -> Missed Calls
        3. -> Dialed numbers
        4. -> Received calls
        """);
        int num = input.nextInt();
        switch (num){
            case 1 -> dialNumber();
            case 2 -> missedCalls();
            case 3 -> dialed();
        }
    }

    private void dialed() {
        for (Object num: dialedNumbers) {
            System.out.println(num);
        }
        System.out.println("Press 1 to go back to home: ");
        int back = input.nextInt();
        home();

    }

    private void missedCalls() {
        System.out.println("""
        these arw your missed calls
        
        09088778898
        07066768777
        
        """);
    }

    private void dialNumber() {
        System.out.println("Please enter the number: ");
        String num = input.next();
        dialedNumbers.add(num);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Dialing "+ num);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ringing...... ");
        System.out.println("Press 1 to go back to home: ");
        int back = input.nextInt();
        home();

    }


}