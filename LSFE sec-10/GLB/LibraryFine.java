import java.util.Scanner;
class LibraryFine {
    static double calculateFine(int lateDays, double rate) {
        return lateDays * rate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Late days: ");
        int days = sc.nextInt();
        System.out.print("Enter fine rate per day: ");
        double rate = sc.nextDouble();
        System.out.println("Fine at given rate: Rs. " + calculateFine(days, rate));
        sc.close();
    }
}
