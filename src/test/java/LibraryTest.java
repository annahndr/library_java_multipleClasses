import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Journey to the Riversea", "Eva Ibbotson", "fiction");
        book2 = new Book("Swallows and Amazons", "Arthur Ransome", "fiction");
    }

    @Test
    public void canCountBooks() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void wontAddBookAtCapacity() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBooksFromCollection() {
        library.addBook(book1);
        library.addBook(book2);
        library.checkOutBook(book1);
        assertEquals(1, library.bookCount());
//        assertEquals([book2], library.libraryCollection());  ??how to check it has removed the right book?
    }
}
