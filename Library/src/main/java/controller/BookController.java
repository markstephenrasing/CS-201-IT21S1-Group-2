package controller;

import model.Book;
import view.MainPage;
import view.BookPanel;

import javax.swing.*;
import java.util.ArrayList;

public class BookController {
    final private MainPage mainPage;
    private ArrayList<Book> books = new ArrayList<>();

    public BookController(MainPage mainPage){
        this.mainPage = mainPage;
    }

    


public void updateBookContainer(){
        JPanel bookContainer = mainPage.getBookContainer();
        bookContainer.removeAll();


        if(books.size() == 0){
            BookPanel bookPanel = new BookPanel();
            bookPanel.setBookTitle("<html><div style='text-align: center;'>No books available</div></html>");
            bookPanel.setAuthor("<html><div style='text-align: center;'>no Author</div></html>");
            bookContainer.add(bookPanel);
        } else{
            for(Book book : books){
                BookPanel bookPanel = new BookPanel();
                bookPanel.setBookTitle(book.getTitle());
                bookPanel.setAuthor(book.getAuthor());
                bookContainer.add(bookPanel);
            }
        }

        bookContainer.revalidate();
        bookContainer.repaint();
    }

    public void addBook(String title, String author){
        int BookId = books.size() + 1;
        Book book = new Book(BookId, title, author);
        books.add(book);
        updateBookContainer();
    }
    

}
