package controller;

import model.Book;
import view.MainPage;
import view.BookPanel;

import javax.swing.*;
import java.util.ArrayList;

public class BookController {
    final private MainPage mainPage;
    private ArrayList<Book> books;

    public BookController(MainPage mainPage, ArrayList<Book> books) {
        this.books = books;
        this.mainPage = mainPage;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void updateBookContainer(ArrayList<Book> books) {
        JPanel bookContainer = mainPage.getBookContainer();
        bookContainer.removeAll();


        if(books.size() == 0){
            BookPanel bookPanel = new BookPanel();
            bookPanel.setBookTitle("<html><div style='text-align: center;'>No books available</div></html>");
            bookPanel.setAvailable("");
            bookPanel.setjBy("");
            bookContainer.add(bookPanel);
        } else{
            for(Book book : books){
                BookPanel bookPanel = new BookPanel();
                bookPanel.setBookTitle(book.getTitle());
                bookPanel.setAuthor(book.getAuthor());
                bookPanel.setAvailable(book.isAvailable());
                bookContainer.add(bookPanel);
            }
        }

        bookContainer.revalidate();
        bookContainer.repaint();
    }

    public void addBook(String title, String author) {
        if (title == null || title.trim().isEmpty() || title.trim().equals("Input Book Title here")) {
            JOptionPane.showMessageDialog(null, 
                "Error: Book title cannot be empty.", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        if (author == null || author.trim().isEmpty() || author.trim().equals("Input Book Author here")) {
            JOptionPane.showMessageDialog(null, 
                "Error: Author name cannot be empty.", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        try {
            int bookId = books.size() + 1;
            Book book = new Book(bookId, title, author);
            books.add(book);
            updateBookContainer(books);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Unable to add book. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void searchBookByTitleOrAuthor(String keyword) {
        ArrayList<Book> searchResults = new ArrayList<>();
        if (keyword != null && !keyword.trim().isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().matches("(?i).*" + keyword + ".*") || book.getAuthor().matches("(?i).*" + keyword + ".*")) {
                    searchResults.add(book);
                }
            }
        }

        if (searchResults.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                "No book found with the given title or author.", 
                "Search Result", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            updateBookContainer(searchResults);
        }
    }
    
}
