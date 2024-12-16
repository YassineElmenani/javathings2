import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventory {
    private List<Item> items;
    
    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        for (Item existingItem : items) {
            if (existingItem.getItemcode().equalsIgnoreCase(item.getItemcode())) {
                System.out.println("Error: An item with code '" + item.getItemcode() + "' already exists.");
                return;
            }
        }
        items.add(item);
        System.out.println("Item added successfully.");
    }
    
    public void removeItem(String itemcode){
        for (Item item : items) {
            if (item.getItemcode().equalsIgnoreCase(itemcode)) {
                items.remove(item);
                System.out.println("Item removed successfully.");
                return;
            }
            System.out.println("Error: Item with code '" + itemcode + "' not found in inventory.");
        }
    }
    public void updateItem(String itemcode,double price,int quantity){
        for (Item item : items) {
            if (item.getItemcode().equalsIgnoreCase(itemcode)) {
               item.setPrice(price);
               item.setQuantity(quantity);
               System.out.println("Item updated successfully.");
            }
            System.out.println("Error: Item with code '" + itemcode + "' not found in inventory");
        }
    }

    public void viewInventory(){
        if (items.isEmpty()) {
            System.out.println("The inventory is currently empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
    public void searchItem(String searchItem){
        for (Item item : items) {
            if (item.getItemcode().equalsIgnoreCase(searchItem) || item.getItemname().equalsIgnoreCase(searchItem)){
                System.out.println(item);
                return;
            }
            System.out.println("Error: not found in inventory");
        }   
    }

    public void sortItemsByPrice(){
    items.sort(Comparator.comparingDouble(Item::getPrice));
    System.out.println("Items sorted by price.");
    }

    public void sortItemsByName() {
        items.sort(Comparator.comparing(Item::getItemname));
        System.out.println("Items sorted by name.");
    }

    public void saveInventoryToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.txt"))) {
            for (Item item : items) {
                writer.write(item.getItemcode() + "," + item.getItemname() + "," + item.getPrice()+ "," + item.getQuantity());
                writer.newLine();
            }
    }catch (IOException e) {
        e.printStackTrace();
    }
}

public void loadInventoryFromFile(){
    try (BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String itemcode = parts[0];
            String itemname = parts[1];
            double price = Double.parseDouble(parts[2]);
            int quantity = Integer.parseInt(parts[3]);
            items.add(new Item(itemcode, itemname, price, quantity));
        }
     } catch (IOException e) {
                e.printStackTrace();
        }
}

}

   
