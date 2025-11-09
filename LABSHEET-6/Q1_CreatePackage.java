// Q1: Create a package named vehicles with classes Car and Bike (demonstration only)
// Since standalone, we'll just simulate behavior
class Car {
    public void start() { System.out.println("Car started"); }
}
class Bike {
    public void ride() { System.out.println("Bike riding"); }
}
public class Q1_CreatePackage {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.ride();
    }
}