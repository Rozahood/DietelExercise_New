package ChapterNine;

import ChapterNine.Diary.Diary;
import ChapterNine.Diary.Entry;
import org.junit.Test;

class DiaryTest {
    Diary diary = new Diary();
    Entry entry = new Entry();

    @Test
    public void testThatEntryCanBeCreated(){
        diary.createEntry("My Title", "My bady");

    }
    @Test
    public void test

}