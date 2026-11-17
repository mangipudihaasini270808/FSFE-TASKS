class CartItems{
    String itemName;
    double itemPrice;
    int itemQuantity;

    CartItems(String name, double price, int quantity){
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }
    int TotalPrice(){
        return (int)(itemPrice * itemQuantity);
    }
    double Discount(){
        if(TotalPrice()>=5000){
            return TotalPrice() * 0.1;
        }
        else if(TotalPrice()>=2000){
            return TotalPrice() * 0.05;
        }
        else{
            return TotalPrice() * 1;
        }
    }
    double FinalPrice(){
        return TotalPrice() - Discount();    
    }
    void displayItemDetails(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: Rs. :" + itemPrice);
        System.out.println("Item Quantity: " + itemQuantity);
    }

}
class Items{
    public static void main(String[] args) {
        CartItems item1 = new CartItems("Laptop", 60000, 1);
        item1.displayItemDetails();
        System.out.println("Total Price: Rs. " + item1.TotalPrice());
        System.out.println("Discount: Rs. " + item1.Discount());
        System.out.println("Final Price: Rs. " + item1.FinalPrice());
    }
}