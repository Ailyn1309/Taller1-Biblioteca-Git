package com.mycompany;

public class Book extends Material{
    private String author;
    private String available;

    public Book(String code, String title, String yearpub, String author, String available) {
        super(code, title, yearpub);
        this.author = author;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
