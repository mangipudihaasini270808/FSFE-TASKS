import java.util.Scanner;
class RailwayStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Passenger name: ");
        String name = sc.nextLine();
        System.out.print("Ticket number: ");
        String ticketNo = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        sb.reverse().append(" - Ticket No: ").append(ticketNo);
        System.out.println(sb);
        sc.close();
    }
}
