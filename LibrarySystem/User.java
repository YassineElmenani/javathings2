package LibrarySystem;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String id;
    private String name;
    private List<Book> borrowedBooks;
    public final static int MAX_BORROWEDBOOKS = 4;
    private static int UserNb = 0;

    public User(String name){
        this.id = this.getClass().getName()+" : "+ ++UserNb;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book, Library library) {
        if (library.canBorrow(this, book)) {
            if (book.CheckAvailability()) {
                if (borrowedBooks.size() < MAX_BORROWEDBOOKS) {
                    borrowedBooks.add(book);
                    book.AssignToUser(this);
                } else {
                    System.out.println("You have reached the maximum number of borrowed books.");
                }
            } else {
                System.out.println("This book is already borrowed.");
            }
        } else {
            System.out.println("The user or book does not belong to this library.");
        }
    }
    
    public void ReturnBook(Book book){
        if(borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
           book.returnToLibrary();
            }else{
                System.out.println("You have not borrowed this book");
            }
    }  
    @Override
    public String toString() {
        return "User{" +this.id+" "+this.name+"}";
    }
}
