package chapterThree.HealthRecord;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateOfBirth {
    private String month; String day; String yearOfBirth;

    public DateOfBirth(String month, String day, String yearOfBirth) {
        this.month = month;
        this.day = day;
        this.yearOfBirth = yearOfBirth;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getUserAge(String yearOfBirth){
        return LocalDate.now().getYear() - Integer.parseInt(yearOfBirth);
    }

}