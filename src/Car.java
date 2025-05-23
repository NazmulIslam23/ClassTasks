public class Car {
    // Attributes
    private String owner;
    private String brand;
    private String serialNumber;
    private double fuelLevel; // in percentage
    private boolean isRunning;

    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false; // initially off
    }

    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start the car. Fuel is empty.");
        }
    }

    public void stopCar() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is already off.");
        }
    }

    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + "%");
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("Car Status: " + (isRunning ? "Running" : "Stopped"));
    }

    public static void main(String[] args) {
        Car myCar = new Car("John Doe", "Toyota", "SN123456789", 75.5);

        myCar.displayInfo();
        myCar.checkFuel();
        myCar.startCar();
        myCar.stopCar();
    }
}
