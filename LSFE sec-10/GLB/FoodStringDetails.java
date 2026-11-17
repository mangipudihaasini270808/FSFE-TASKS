import java.util.Scanner;
class FoodStringDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer name: ");
        String name = sc.nextLine();
        System.out.print("Food item: ");
        String food = sc.nextLine();
        System.out.print("Word to search: ");
        String word = sc.nextLine();
        System.out.println("Name length: " + name.length());
        System.out.println("Food in uppercase: " + food.toUpperCase());
        System.out.println("Contains word? " + food.toLowerCase().contains(word.toLowerCase()));
        sc.close();
    }
}
