import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> libraryCollection;

//    constructor
    public Library(int capacity){
        this.capacity = capacity;
        this.libraryCollection = new ArrayList<Book>();
    }

    public ArrayList libraryCollection(){
        return this.libraryCollection;
    }

    public int bookCount() {
        return this.libraryCollection.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.libraryCollection.add(book);
        }
    }

    public void checkOutBook(Book book) {
        this.libraryCollection.remove(book);
    }
}
