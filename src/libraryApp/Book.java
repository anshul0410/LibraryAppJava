package libraryApp;

public class Book {
    private String isbn;
    private String name;
    private String genre;
    private String description;
    private String author;

    public Book(String isbn, String name, String genre, String description, String author) {
        this.isbn = isbn;
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
