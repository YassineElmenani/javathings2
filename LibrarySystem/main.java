package LibrarySystem;
public class main {
    public static void main(String[] args) {
        // Step 1: Create a Library
        Library myLibrary = new Library("Central Library");

        // Step 2: Create Books
        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", myLibrary);
        Book book2 = new Book("B002", "1984", "George Orwell", myLibrary);
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee", myLibrary);

        // Add books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        // Step 3: Create Users
        User user1 = new User( "Alice");
        User user2 = new User( "Bob");

        // Register users in the library
        myLibrary.registreUser(user1);
        myLibrary.registreUser(user2);

        // Step 4: Display Initial State
        System.out.println("Initial Books in the Library:");
        myLibrary.listBooks();
        System.out.println("\nInitial Users in the Library:");
        myLibrary.listUsers();

        // Step 5: Borrow a Book
        System.out.println("\nAlice borrows '1984':");
        user1.borrowBook(book2, myLibrary);
        System.out.println("Is '1984' borrowed? " + !book2.CheckAvailability());

        // Step 6: Try to Borrow the Same Book Again
        System.out.println("\nBob tries to borrow '1984':");
        user2.borrowBook(book2, myLibrary);

        // Step 7: Return a Book
        System.out.println("\nAlice returns '1984':");
        user1.ReturnBook(book2);
        System.out.println("Is '1984' borrowed? " + !book2.CheckAvailability());

        // Step 8: Display Final State
        System.out.println("\nFinal Books in the Library:");
        myLibrary.listBooks();
    }
}
