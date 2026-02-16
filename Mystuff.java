package mystuff;

public class Mystuff {

    // Instance variables (attributes)
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor
    public Mystuff(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0; // default starting speed
    }

    // Method to accelerate
    public void accelerate(int amount) {
        speed += amount;
        System.out.println("Accelerated by " + amount + " mph.");
    }

    // Method to brake
    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Braked by " + amount + " mph.");
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car: " + year + " " + brand + " " + model);
        System.out.println("Current Speed: " + speed + " mph");
    }
}
