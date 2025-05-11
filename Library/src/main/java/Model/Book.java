/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Baron
 */
public class Book {
    final private String bookId;
    final private String title;
    final private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = String.format("<html><div style='text-align: center;'>%s</div></html>", title);
        this.author = String.format("<html><div style='text-align: center;'>%s</div></html>", author);
        this.isAvailable = true; // Initially, all books are available.
    }

    // Getters and Setters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
