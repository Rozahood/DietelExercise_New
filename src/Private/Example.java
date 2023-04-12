package Private;

public class Example {
    public static void main(String[] args) {
        /*String zen = "Royalpriesthood";
        char[] newZen = new char[14];
        zen.getChars(1,15, newZen, 0);
        System.out.println(zen.charAt(0));
        System.out.println(zen.charAt(1));
        System.out.println(newZen);*/

        String firstName = new String("I love you!");
        String secondString = new String("I love you!");
        //System.out.println(firstName == secondString);
        System.out.println(firstName.equals(secondString));

        //System.out.println(firstName == secondString);

        String thirdName = "I love you!";
        String fourthString = "I love you!";
        System.out.println(thirdName == fourthString);
        //System.out.println(firstName == secondString);
    }
}
