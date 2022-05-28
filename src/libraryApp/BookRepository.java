package libraryApp;

import java.util.ArrayList;
import java.util.Locale;

public class BookRepository {
    ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("25367", "The Kite Runner", "Historic Fiction", null, "Khaleed Hosseini", 10, 7));
        books.add(new Book("83943", "Not a Penny More, Not a Penny Less", "Thriller Fiction", null, "Jeffrey Archer", 5, 2));
        books.add(new Book("34209", "The Silent Patient", "Psychological Fiction", null, "Alex Michaelides", 8, 7));
        books.add(new Book("20349", "The Diary of a Young Girl", "Autobiography", null, "Anne Frank", 15, 9));
        books.add(new Book("89401", "Lord of the Flies", "Allegory", null, "William Golding", 6, 6));
        books.add(new Book("66473", "The Nightingale", "Historic Fiction", null, "Kristin Hannah", 12, 4));
        books.add(new Book("40024", "To Kill a Mockingbird", "Fiction", null, "Harper Lee", 11, 9));
        books.add(new Book("34544", "The Book Thief", "Historic Fiction", null, "Markus Zusak", 5, 1));
        books.add(new Book("11123", "Fahrenheit 451", "Dystopian Fiction", null, "Ray Bradbury", 10, 5));
    }

    public Book findByIsbn(String isbn) {
        for (Book book: books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> bookMatched = new ArrayList<>();
        for (Book book: books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                bookMatched.add(book);
            }
        }
        return bookMatched;
    }

}
