package OPP.Phonebook.message;

import java.util.ArrayList;
import java.util.List;

public class Messaging {
    private List<Message> messageList = new ArrayList<>();


    public void save(Message message) {
        messageList.add(message);

    }


}
