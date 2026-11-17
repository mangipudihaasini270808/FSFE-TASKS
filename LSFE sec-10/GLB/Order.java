class Order {
    int orderId;
    String customerName, foodItem;
    Order(int orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }
    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Food item: " + foodItem);
    }
    public static void main(String[] args) {
        Order o = new Order(501, "Riya", "Veg Burger");
        o.display();
    }
}
