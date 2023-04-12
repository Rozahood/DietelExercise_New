package OPP.Phonebook.message;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("5689605969","Dean", "48339873", "i love royabalaba");

        Messaging messaging = new Messaging();
        messaging.save(message);


    }
}
