import java.util.*;

class StudentMarksArray {
    int[] marks;
    String studentName;

    StudentMarksArray(String name, int[] marks) {
        this.studentName = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        StudentMarksArray student = new StudentMarksArray(name, marks);
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Average Marks: " + student.calculateAverage());
    }
}