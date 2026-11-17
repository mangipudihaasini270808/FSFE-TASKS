import java.util.*;
class ElectricityBillUsingConstructor{
    String customerName;
 int units;

ElectricityBillUsingConstructor(String customerName, int units){
this.customerName = customerName;
this.units = units;
}
double calculateBill() {
        double bill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        ElectricityBillUsingConstructor billObj = new ElectricityBillUsingConstructor(customerName, units);

        System.out.println("Customer Name: " + billObj.customerName);
        System.out.println("Total Bill: " + billObj.calculateBill());

    }
}
