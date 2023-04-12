package ChapterSix.CrapProgram;

public class CrapProgram {
    private int dieRoll;

    public CrapProgram() {
        this.dieRoll = 0;
    }
    public int Roll(){
        dieRoll = (int) (Math.random() * 6) + 1;
        return dieRoll;
    }
}
