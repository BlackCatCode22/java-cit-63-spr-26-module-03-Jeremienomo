package mystudent;

public class Student {

    // Instance variables (fields)
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    // Method to update GPA
    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
        System.out.println(name + "'s GPA has been updated to " + gpa);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}
