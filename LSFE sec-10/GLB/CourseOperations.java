
import java.util.ArrayList;
import java.util.List;

public class CourseOperations {
    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();

        // Adding courses
        courses.add("Java");
        courses.add("Python");
        courses.add("C Programming");
        courses.add("Web Development");

        System.out.println("Original Courses: " + courses);

        // Updating a course
        courses.set(1, "Advanced Python");

        System.out.println("After Updating: " + courses);

        // Removing a course
        courses.remove("C Programming");

        System.out.println("After Removing: " + courses);

        // Retrieving a course
        String course = courses.get(1);

        System.out.println("Retrieved Course: " + course);

        // Displaying all courses
        System.out.println("Final Course List:");

        for (String c : courses) {
            System.out.println(c);
        }
    }
}
