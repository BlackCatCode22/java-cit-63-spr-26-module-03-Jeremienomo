package myanimals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);

        System.out.println("Dog created: " + name);
        System.out.println("Current number of animals: " + Animal.getNumOfAnimals());
        System.out.println();
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}
