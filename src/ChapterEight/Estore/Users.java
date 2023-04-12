package ChapterEight.Estore;

public class Users {
    private int age;
    private String emailAddress;
    private Addresses homeAddress;
    private String name;
    private String password;
    private String phone;

    public Users(int age, String emailAddress, Addresses homeAddress,
                 String name, String password, String phone) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Addresses getHomeAddress() {
        return homeAddress;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}