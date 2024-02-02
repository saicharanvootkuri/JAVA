class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int doors) {
        super(brand);
        this.numberOfDoors = doors;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.displayCarInfo(); 
    }
}
