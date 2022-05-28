package libraryApp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("40024");
        app.searchByIsbn("12345");
        app.searchByIsbn("20349");

        app.searchByName("the");
    }
}