package ChapterSix.CrapProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrapProgramTest {
    @Test public void CrapProgramCanBeCreatedTest(){
        CrapProgram dieRoll= new CrapProgram();
        assertNotNull(dieRoll);
    }
    @Test public void CrapProgramIsEmpty(){
        CrapProgram dieRoll = new CrapProgram();
        assertNotNull(dieRoll);
    }

}