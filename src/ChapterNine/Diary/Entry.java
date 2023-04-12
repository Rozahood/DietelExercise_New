package ChapterNine.Diary;

import java.time.LocalDateTime;

public class Entry {
    private  int id;
    private String title;
    private LocalDateTime localDateTime;
    private  String body;

    public Entry( int id, String title, String body,LocalDateTime localDateTime) {
        this.title = title;
        this.body = body;
        this.localDateTime = LocalDateTime.now();
        this.id = this.id;
    }

    public Entry() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setBody(String body) {
        if(body.isBlank()) throw  new IllegalArgumentException("Body cannot be blank");
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getBody() {
        return body;
    }



}
