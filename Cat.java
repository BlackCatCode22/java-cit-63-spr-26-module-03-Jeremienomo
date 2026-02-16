package myanimals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);

        System.out.println("Cat created: " + name);
        System.out.println("Current number of animals: " + Animal.getNumOfAnimals());
        System.out.println();
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}
