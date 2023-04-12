package OPP.Phonebook.message;

public class Message {
    private String number;
    private String sender;
    private String receiver;
    private String message;
    private boolean isSent;

    public Message(String number, String sender, String receiver, String message) {
        this.number = number;
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }


}
