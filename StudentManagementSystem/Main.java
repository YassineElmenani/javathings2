import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to the Student Management System");
      System.out.println("1. Add a new student");
      System.out.println("2. Add a new course");
      System.out.println("3. Enroll a student in a course");
      System.out.println("4. Remove a student from a course");
      System.out.println("5. List all courses of a student");
      System.out.println("6. List all students in a course");
      System.out.println("7. Exit");
      System.out.println("Enter your choice:");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
        System.out.print("Enter first name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lname = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        new Student(fname, lname, age);
            break;
        case 2:
         System.out.print("Enter cours name: ");
         String Coursname = scanner.nextLine();
         System.out.print("Enter maximum students for the course: ");
         int place = scanner.nextInt();
         new Student(fname, lname, age);
            break;
    
        default:
            break;
      }
      


    }
}
