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

    


    public void populateBooks(){
        JPanel bookContainer = mainPage.getBookContainer();

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

        mainPage.revalidate();
        mainPage.repaint();
    }
}
