package mystudent;

public class App {

    public static void main(String[] args) {

        // Create Student objects
        Student student1 = new Student("Alice", 16, 3.8);
        Student student2 = new Student("Bob", 17, 3.5);

        // Display info
        student1.displayInfo();
        student2.displayInfo();

        // Update GPA
        student2.updateGPA(3.9);

        // Display again to confirm change
        student2.displayInfo();
    }
}
