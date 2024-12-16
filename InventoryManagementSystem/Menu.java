import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
    while(true){
        System.out.println("Welcome to the Inventory Management System");
        System.out.println("1. Add an new  item to the inventory.");
        System.out.println("2. Remove an item");
        System.out.println("3. Update an item");
        System.out.println("4. Search for an  item");
        System.out.println("5. Sort items by Price");
        System.out.println("6. Sort items by Name");
        System.out.println("7. Display all items");
        System.out.println("8. Save");
        System.out.println("9. load");
        System.out.println("10. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        switch (choice) {
          case 1:
             System.out.println("-------Create----");
             System.out.println("entre the item code");
             String itemCode = scanner.next();
             System.out.println("entre the item name");
             String itemName = scanner.next();
             System.out.println("entre the item price");
             double itemPrice = scanner.nextDouble();
             if(itemPrice < 0){
                System.out.println("price cannot be negative");
                break;
             }
             System.out.println("entre the item quantity");
             int itemQuantity = scanner.nextInt();
             if(itemQuantity<0){
                System.out.println("quantity cannot be negative");
                break;
             }
             Item item = new Item(itemCode, itemName, itemPrice, itemQuantity);
             inventory.addItem(item);
             System.out.println("Item added successfully");

              break;
          case 2:
             System.out.println("-------Remove----");
             System.out.println("entre the item code");
             String itemCode1 = scanner.next();
             inventory.removeItem(itemCode1);
              break;
        case 3:
        System.out.println("-------Update----");
        System.out.println("entre the item code");
        String itemCode2 = scanner.next();
        System.out.println("entre the new price for the item ");
        double itemprice1 = scanner.nextDouble();
        if(itemprice1 < 0){
            System.out.println("price cannot be negative");
            break;
         }
        System.out.println("entre the new quantity for the item ");
        int itemQuantity1 = scanner.nextInt();
        if(itemQuantity1<0){
            System.out.println("quantity cannot be negative");
            break;
         }
        inventory.updateItem(itemCode2, itemprice1,itemQuantity1);
        break;
        case 4:
        System.out.println("entre the search item (name or code)");
        String searchItem = scanner.next();
        inventory.searchItem(searchItem);
        break;
        case 5:
        inventory.sortItemsByPrice();
        break;
        case 6:
        inventory.sortItemsByName();
        break;
        case 7:
        System.out.println("-------Inventory----");
        inventory.viewInventory();
        break;
        case 8:
        inventory.saveInventoryToFile();
        break;
        case 9:
        inventory.loadInventoryFromFile();
        break;
        case 10:
        System.out.println("Exiting the system. Goodbye!");
        scanner.close();
        return;
          default:
          System.out.println("Invalid choice. Please try again.");
        }
    
    }
    }
}
