package mystuff;

public class Driver {

    public static void main(String[] args) {

        // Create a Car object
        Mystuff myCar = new Mystuff("Toyota", "Camry", 2022);

        // Use the object's methods
        myCar.displayInfo();
        myCar.accelerate(30);
        myCar.displayInfo();
        myCar.brake(10);
        myCar.displayInfo();
    }
}
