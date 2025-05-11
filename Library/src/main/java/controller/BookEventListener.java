package controller;

import model.Book;
import java.util.ArrayList;

public interface BookEventListener {
    ArrayList<Book> getBooks();
    void onBookUpdated(ArrayList<Book> books);
    void onAddBook(String title, String author);
    void onBookSearch(String searchTerm);
}


