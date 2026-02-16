package myanimals;

public class Animal {

    protected String name;
    protected int age;

    // Static variable shared by ALL Animal objects
    protected static int numOfAnimals = 0;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

        // Increase count whenever an Animal (or subclass) is created
        numOfAnimals++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}
