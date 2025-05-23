/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;
import view.MainPage;
import java.util.ArrayList;

/**
 *
 * @author Baron
 */
public class Library {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainPage view = new MainPage();
            BookController bookController = new BookController(view, new ArrayList<>());
            bookController.updateBookContainer(bookController.getBooks());
            view.display();
        });
    }
}
