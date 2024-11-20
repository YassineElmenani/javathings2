package LibrarySystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> Books;
    private List<User> Users;

    public Library(String name){
        this.name = name;
        this.Books = new ArrayList<>();
        this.Users = new ArrayList<>();
    }
    public void addBook(Book book){
        this.Books.add(book);
    }
    public void removeBook(Book book){
        this.Books.remove(book);
    }
    public void listBooks(){
        for(Book book : Books){
            if (book.CheckAvailability()) { // Check if the book is not borrowed
                System.out.println(book.toString());
            }
        }
    }
    public boolean containsBook(Book book){
        return this.Books.contains(book);
    }

    public void registreUser(User user){
        this.Users.add(user);
    }
    public void deleteUser(User user){
        this.Users.remove(user);
    }
    public void listUsers(){
        for(User user : Users){
            System.out.println(user.toString());
        }
    }
    public boolean containsUser(User user){
        return this.Users.contains(user);
    }

    public boolean canBorrow(User user, Book book) {
        return containsUser(user) && containsBook(book);
    }
    
}
