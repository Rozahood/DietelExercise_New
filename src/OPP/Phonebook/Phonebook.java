package OPP.Phonebook;

public class Phonebook {
    private Name name;
    private Address address;
    private String phoneNumber;
    private String business;
    private Settings settings;

    public Phonebook(Name name, Address address, String phoneNumber, String business) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.business = business;
    }
    public Phonebook(){}
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}