import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Jane", 2);
        book = new Book("The Day the Whales Came", "Michael Morpurgo", "fiction");
        library = new Library(5);
    }

    @Test
    public void borrowerLoansAreEmpty(){
        assertEquals(0, borrower.booksOnLoanCount());
    }

    @Test
    public void canBorrowBooks() {
        library.addBook(book); //add a book to the library collection
        borrower.borrowBook(library, book); // remove it from the library and into the borrower's loans array
        assertEquals(1, borrower.booksOnLoanCount());
        assertEquals(0, library.bookCount());
    }
}
