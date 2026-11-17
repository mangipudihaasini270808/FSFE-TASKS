import java.util.Scanner;

public class ExtractUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email address: ");
        String email = sc.nextLine();

        String[] parts = email.split("@");
        String username = parts.length > 1 ? parts[0] : "Invalid email address";

        System.out.println("Username: " + username);
        sc.close();
    }
}