import java.util.*;
public class IntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int den = sc.nextInt();
        int result = num1 / den;
        int remainder = num1 % den;
        double decimalResult = (double) num1 / den;
        System.out.printf("The decimal result is: %.2f\n", decimalResult);
        System.out.printf("The result is: %d\n", result);  
        System.out.printf("The remainder is: %d\n", remainder);
    }
    
}
