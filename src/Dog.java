public class Dog {
    // Attributes
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to bark
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Method to spin
    public void spin() {
        System.out.println(name + " is spinning in circles!");
    }

    // Method to run
    public void run() {
        System.out.println(name + " is running happily!");
    }

    // Method to display dog info
    public void displayInfo() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }

    // Main method to test
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Labrador");

        myDog.displayInfo();
        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}
