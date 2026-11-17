import java.util.*;
public class BillDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total bill amount: ");
        double totalBill = sc.nextDouble();
        System.out.print("Enter the number of people to split the bill: ");
        int numPeople = sc.nextInt();
        double amountPerPerson = totalBill / numPeople;
        System.out.printf("Each person should pay: $ %.2f\n", amountPerPerson);
    }
    
}
