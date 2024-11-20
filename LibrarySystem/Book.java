package LibrarySystem;
public class Book{
    private String id;
    private String title;
    private String author;
    private Boolean isBorrowed = false;
    private User BorrowedBy;
    private Library Library;
    public Book(String id,String title,String author,Library Library){
        this.id=id;
        this.title=title;
        this.author=author;
        this.Library=Library;
    }
   public boolean CheckAvailability(){
      return !isBorrowed;
   }
   public void AssignToUser(User user){
        BorrowedBy = user;
        setBookStatus(true);
   }
   public void returnToLibrary() {
    BorrowedBy = null;
    setBookStatus(false); // Update status when returned
}

   @Override
   public String toString(){
    return "Book{" +this.id+" "+this.title+" "+this.author+"}";
   }
   public void setBookStatus(Boolean status){
    this.isBorrowed=status;
   }
}