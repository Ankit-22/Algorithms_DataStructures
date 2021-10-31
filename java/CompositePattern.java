import java.util.*;

abstract class BookComponent {
    void add(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    String getBookInfo() {
        throw new UnsupportedOperationException();
    }

    String getGenreInfo() {
        throw new UnsupportedOperationException();
    }
}

class BookGroup extends BookComponent {

    private String genre;

    BookGroup(String genre) {
        this.genre = genre;
    }

    List<BookComponent> bookList = new ArrayList<>();

    void add(BookComponent component) {
        bookList.add(component);
    }

    void remove(BookComponent component) {
        bookList.remove(component);
    }

    String getGenreInfo() {
        return this.genre;
    }
}

class Book extends BookComponent {

    private String bookName;

    Book(String bookName) {
        this.bookName = bookName;
    }

    String getBookName() {
        return bookName;
    }

}

public class Suraj {
    public static void main(String[] args) {
        BookComponent c1 = new Book("Song of Ice and Fire");
        BookComponent c2 = new Book("Moby Dick");
        BookComponent c3 = new Book("Volga to Ganga");
        BookComponent c4 = new Book("Wheel of Time");

        BookComponent c5 = new BookGroup("High Fantasy");
        c5.add(c1);
        c5.add(c4);

        BookComponent c6 = new BookGroup("Travel Literature");
        c6.add(c2);
        c6.add(c3);

        BookComponent c7 = new BookGroup("All Books");
        c7.add(c5);
        c7.add(c6);
    }
}
