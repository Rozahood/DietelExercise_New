package OPP.Phonebook;

public class Name {
    private String surname;
    private String firstName;
    private String middleName;

    public Name(String surname, String firstName, String middleName) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
