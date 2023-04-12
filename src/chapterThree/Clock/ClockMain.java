package chapterThree.Clock;

public class ClockMain {
    public static void main(String[] args) {
        ClockClass blueClock = new ClockClass(5,20, 4);
        blueClock.displayTime();

        ClockClass greenClock = new ClockClass(3,41, 7);
        greenClock.getCurrentTime();
    }
}
