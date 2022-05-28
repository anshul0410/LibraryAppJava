package libraryApp;

import java.util.ArrayList;

public class BookRepository {
    ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("25367", "The Kite Runner", "Historic Fiction", null, "Khaleed Hosseini"));
        books.add(new Book("83943", "Not a Penny More, Not a Penny Less", "Thriller Fiction", null, "Jeffrey Archer"));
        books.add(new Book("34209", "The Silent Patient", "Psychological Fiction", null, "Alex Michaelides"));
        books.add(new Book("20349", "The Diary of a Young Girl", "Autobiography", null, "Anne Frank"));
        books.add(new Book("89401", "Lord of the Flies", "Allegory", null, "William Golding"));
        books.add(new Book("66473", "The Nightingale", "Historic Fiction", null, "Kristin Hannah"));
        books.add(new Book("40024", "To Kill a Mockingbird", "Fiction", null, "Harper Lee"));
        books.add(new Book("34544", "The Book Thief", "Historic Fiction", null, "Markus Zusak"));
        books.add(new Book("11123", "Fahrenheit 451", "Dystopian Fiction", null, "Ray Bradbury"));
    }
}
