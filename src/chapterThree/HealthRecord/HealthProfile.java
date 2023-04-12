package chapterThree.HealthRecord;

import ChapterSix.Gender;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private Gender gender;
    private DateOfBirth dateOfBirth;
    private String height;
    private String weight;

    public HealthProfile(String firstName, String lastName, Gender gender, DateOfBirth dateOfBirth, String height, String weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge(String year){
        return dateOfBirth.getUserAge(year);
    }

    public static void main(String[] args) {
        DateOfBirth royalDateOfBirth = new DateOfBirth("Oct", "17", "1983");
        HealthProfile Royal = new HealthProfile("Samson","Samuel",Gender.FEMALE, royalDateOfBirth,"2","4");
        System.out.println(Royal.getAge(Royal.getDateOfBirth().getYearOfBirth()));
    }
}