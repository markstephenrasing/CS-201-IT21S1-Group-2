/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import model.Book;
/**
 *
 * @author Baron
 */
public class BookPanel extends javax.swing.JPanel {
    Book book;
    MainPage mainPage;

    /**
     * Creates new form Book
     */
    public BookPanel(Book book, MainPage mainPage) {
        this.mainPage = mainPage;
        this.book = book;
        initComponents();
    }
    
    public BookPanel() {
        this.book = null;
        initComponents();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lBookTitle = new javax.swing.JLabel();
        jBy = new javax.swing.JLabel();
        lAuthor = new javax.swing.JLabel();
        lAvailable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 2, 1, 2));
        setMinimumSize(new java.awt.Dimension(100, 127));
        setPreferredSize(new java.awt.Dimension(100, 127));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        lBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBookTitle.setForeground(new java.awt.Color(0, 0, 0));
        lBookTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBookTitle.setText("Title");
        lBookTitle.setFocusCycleRoot(true);
        lBookTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        add(lBookTitle, gridBagConstraints);

        jBy.setForeground(new java.awt.Color(0, 0, 0));
        jBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBy.setText("By:");
        jBy.setPreferredSize(new java.awt.Dimension(100, 127));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(jBy, gridBagConstraints);

        lAuthor.setForeground(new java.awt.Color(0, 0, 0));
        lAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAuthor.setText("Author");
        lAuthor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(lAuthor, gridBagConstraints);

        lAvailable.setForeground(new java.awt.Color(0, 225, 0));
        lAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAvailable.setText("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(lAvailable, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setForeground(new java.awt.Color(192, 192, 192)); 
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192), 2)); 
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBorder(null);
        setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            CheckoutOrReturnBookDialog dialog = new CheckoutOrReturnBookDialog(new javax.swing.JFrame(), true, BookPanel.this);
                dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_formMouseClicked

    public void onSetAvailability(Book book){
        if (mainPage != null) {
            mainPage.onSetAvailability(book);
        }
        setAvailable(book.isAvailable());
    }

    public void setBookTitle(String title) {
        lBookTitle.setText(title);
    }

    public void setAuthor(String author) {
        lAuthor.setText(author);
    }

    public Boolean isAvailable(){
        return lAvailable.getText().equals("Available") ? true : false;
    }

    public void setAvailable(Boolean available) {
        lAvailable.setText(available ? "Available" : "Not Available");
        if (available) {
            lAvailable.setForeground(new java.awt.Color(0, 253, 0)); // Green
        } else {
            lAvailable.setForeground(new java.awt.Color(255, 0, 0)); // Red
        }
    }

    public void setAvailable(String available) {
        lAvailable.setText(available);
    }

    public void setjBy(String s){
        jBy.setText(s);
    }

    public Book getBook() {
        return book;
    }

    public MainPage getMainPage() {
        return mainPage;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBy;
    private javax.swing.JLabel lAuthor;
    private javax.swing.JLabel lAvailable;
    private javax.swing.JLabel lBookTitle;
    // End of variables declaration//GEN-END:variables
}
