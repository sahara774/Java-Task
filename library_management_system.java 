package com.mycompany.librarymanagementsystem;
import java.util.Date;

public class LibraryManagementSystem {

    
    public static class User {
        private String userID;
        private String name;
        private String email;

        public User(String userID, String name, String email) {
            this.userID = userID;
            this.name = name;
            this.email = email;
        }

        public String getUserID() { return userID; }
        public void setUserID(String userID) { this.userID = userID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    
    public static class Librarian extends User {
        private String employeeID;

        public Librarian(String userID, String name, String email, String employeeID) {
            super(userID, name, email);
            this.employeeID = employeeID;
        }

        public String getEmployeeID() { return employeeID; }
        public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
    }

    
    public static class Book {
        private String bookID;
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String bookID, String title, String author, boolean isAvailable) {
            this.bookID = bookID;
            this.title = title;
            this.author = author;
            this.isAvailable = isAvailable;
        }

        public String getBookID() { return bookID; }
        public void setBookID(String bookID) { this.bookID = bookID; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }
        public boolean isAvailable() { return isAvailable; }
        public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
    }

    
    public static class Account {
        private String accountID;
        private User user;
        private Date createdDate;

        public Account(String accountID, User user, Date createdDate) {
            this.accountID = accountID;
            this.user = user;
            this.createdDate = createdDate;
        }

        public String getAccountID() { return accountID; }
        public void setAccountID(String accountID) { this.accountID = accountID; }
        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }
        public Date getCreatedDate() { return createdDate; }
        public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }
    }

    
    public static class Transaction {
        private String transactionID;
        private Book book;
        private User user;
        private Date issueDate;
        private Date returnDate;

        public Transaction(String transactionID, Book book, User user, Date issueDate, Date returnDate) {
            this.transactionID = transactionID;
            this.book = book;
            this.user = user;
            this.issueDate = issueDate;
            this.returnDate = returnDate;
        }

        public String getTransactionID() { return transactionID; }
        public void setTransactionID(String transactionID) { this.transactionID = transactionID; }
        public Book getBook() { return book; }
        public void setBook(Book book) { this.book = book; }
        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }
        public Date getIssueDate() { return issueDate; }
        public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }
        public Date getReturnDate() { return returnDate; }
        public void setReturnDate(Date returnDate) { this.returnDate = returnDate; }
    }

    
    public static void main(String[] args) {
        
        User user = new User("U001", "Alice", "alice@example.com");

        
        Librarian librarian = new Librarian("U002", "Bob", "bob@example.com", "E001");

        
        Book book = new Book("B001", "Java Programming", "John Doe", true);

        
        Account account = new Account("A001", user, new Date());

        
        Transaction transaction = new Transaction("T001", book, user, new Date(), null);

        
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
        System.out.println("Librarian: " + librarian.getName() + ", Employee ID: " + librarian.getEmployeeID());
        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        System.out.println("Transaction ID: " + transaction.getTransactionID() + ", Book: " + transaction.getBook().getTitle());
    }
}
