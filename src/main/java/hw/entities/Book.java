package hw.entities;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private String info;
    private Date date;

    public Book() {
    }

    public Book(int id, String title, String info, Date date) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "id: " + id + ", " + title + ", info:" + info + ", date:" + date;
    }
}
