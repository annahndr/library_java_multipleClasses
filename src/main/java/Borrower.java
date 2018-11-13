import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booksOnLoan;
    private int loanCapacity;

//    constructor
    public Borrower(String name, int loanCapacity){
        this.name = name;
        this.loanCapacity = loanCapacity;
        this.booksOnLoan = new ArrayList<Book>();
    }

    public int booksOnLoanCount() {
        return this.booksOnLoan.size();
    }

    public void borrowBook(Library library, Book book) {
        if(this.booksOnLoanCount() < this.loanCapacity){
            library.checkOutBook(book);
            this.booksOnLoan.add(book);
        }
    }
}


