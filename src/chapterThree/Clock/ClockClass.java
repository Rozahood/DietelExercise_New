package chapterThree.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockClass {
    private int hour;
    private int minute;
    private int second;

    public ClockClass(int hour, int minute, int second) {   // This constructor exists only to give our objects default values.
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59){
            this.minute = 0;
        }else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59){
            this.second = 0;
        }else {
            this.second = second;
        }
    }

    public void displayTime(){
        System.out.println("The time here is " + getHour() + ":" + getMinute() + ":" + getSecond());

    }

    public void getCurrentTime(){
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:ss:mm")));
    }
}