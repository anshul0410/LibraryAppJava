package libraryApp;

public class LibraryApp {
    BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.println("Searching book by ISBN: " + isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.println("1 Book Found: ");
            System.out.println("\tISBN: " + book.getIsbn() + "\n\tName: " + book.getName() + "\n\tGenre: " + book.getGenre() + "\n\tAuthor: " + book.getAuthor());
        } else {
            System.out.format("0 Books Found for ISBN %s", isbn);
        }
    }
}
