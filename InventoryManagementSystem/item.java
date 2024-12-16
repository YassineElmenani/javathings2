class Item{
   private String itemcode;
   private String itemname;
   private double price;
   private int quantity;
   
   public Item(String itemcode, String itemname, double price, int quantity) {
    this.itemcode = itemcode;
    this.itemname = itemname;
    this.price=price;
    this.quantity=quantity;
   }

public String getItemcode() {
    return itemcode;
}

public void setItemcode(String itemcode) {
    this.itemcode = itemcode;
}

public String getItemname() {
    return itemname;
}

public void setItemname(String itemname) {
    this.itemname = itemname;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    if(price < 0){
        throw new IllegalArgumentException("Price cannot be negative");
    }
    this.price = price;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity2) {
    if(quantity2 < 0){
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
    this.quantity = quantity2;
}

@Override
public String toString() {
    return "Item [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", quantity=" + quantity
            + "]";
}

}