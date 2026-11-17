import java.util.*;
public class IDGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
         int age = sc.nextInt();
        System.out.print("Enter your height (m): ");
        double height = sc.nextDouble();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        System.out.println(" ---ID CARD--- \n %s \n Age: %d \n Height: %.2f m \n Student: %b".formatted(name, age, height, isStudent));


    }
}
