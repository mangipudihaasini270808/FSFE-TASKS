class Student{
    String Name;
    int marks1;
    int marks2;
    int marks3;

    Student(String name, int m1, int m2, int m3){
        this.Name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
    int totalMarks(){
        return marks1 + marks2 + marks3;
    }

    double percentage(){
        int total = totalMarks();
        return (total / 300.0)*100;
    }

    void display(){
        System.out.println("Name: " + Name);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Percentage: " + percentage() + "%");
    }
}

class StudentMarks{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85, 90, 78);
        Student student2 = new Student("Bob", 75, 80, 88);
        Student student3 = new Student("Charlie", 92, 85, 95);

        student1.display();
        System.out.println();
        student2.display();
        System.out.println();
        student3.display();
    }
}