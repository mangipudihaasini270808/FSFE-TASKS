import java.util.*;
public class Favourite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favourite number:  ");
        int favouriteNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter your favourite quote:  ");
        String favouriteQuote = sc.nextLine();
        System.out.println("Your favourite number is: %d \n Your favourite quote is: %s".formatted(favouriteNumber, favouriteQuote));
    }
}
