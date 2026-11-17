import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        int sum = addNumbers(numbers);
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);

        System.out.println("Sum of 5 numbers: " + sum);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close();
    }

    public static int addNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static int findLargest(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int findSmallest(ArrayList<Integer> list) {
        return Collections.min(list);
    }
}