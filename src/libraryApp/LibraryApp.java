package libraryApp;

import java.util.ArrayList;

public class LibraryApp {
    BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.println("\nSearching book by ISBN: " + isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.println("1 Book Found: ");
            System.out.println("\tISBN: " + book.getIsbn() + "\n\tTitle: " + book.getTitle() + "\n\tGenre: " + book.getGenre() + "\n\tAuthor: " + book.getAuthor());
        } else {
            System.out.println("0 Books Found\n");
        }
    }

    public void searchByName(String keyword) {
        System.out.println("\nSearching book by title: " + keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        int bookCount = books.size();
        System.out.format("%d Books found%s\n", bookCount, bookCount == 0 ? "." : ":");

        for (Book book: books) {
            System.out.println();
            System.out.println("\tTitle: " + book.getTitle() + "\n\tGenre: " + book.getGenre() + "\n\tAuthor: " + book.getAuthor());
            System.out.println("______________");
        }
    }

    public void bookCheckOut(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("Book checked out successfully: ");
                System.out.println("\tISBN: " + book.getIsbn() + "\n\tTitle: " + book.getTitle() + "\n\tAuthor: " + book.getAuthor());
            } else {
                System.out.println("Checkout Failed");
                System.out.println("\tISBN: " + book.getIsbn() + "\n\tTitle: " + book.getTitle() + "\n\tAuthor: " + book.getAuthor());
                System.out.println("Reason: More books checked out than recorded quantity");
            }
        } else {
            System.out.println("\nFailed to checkout book");
            System.out.println("Reason: There is no book with that ISBN\n");
        }
    }

    public void bookCheckIn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkIn()) {
                System.out.println("Book checked in successfully: ");
                System.out.println("\tISBN: " + book.getIsbn() + "\n\tTitle: " + book.getTitle() + "\n\tAuthor: " + book.getAuthor());
            } else {
                System.out.println("Checkin Failed");
                System.out.println("\tISBN: " + book.getIsbn() + "\n\tTitle: " + book.getTitle() + "\n\tAuthor: " + book.getAuthor());
                System.out.println("Reason: More books checked in than recorded quantity");
            }
        } else {
            System.out.println("\nFailed to checkin book");
            System.out.println("Reason: There is no book with that ISBN\n");
        }
    }
}
