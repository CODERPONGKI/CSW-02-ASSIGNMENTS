//Write a Java program that illustrates the concepts of interfaces, method overriding, and
//method overloading. Begin by defining an interface named Vehicle with two abstract methods:
//accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement
//the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print
//appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the
//Bicycle class, override the same methods to display messages specific to a bicycle's
//acceleration and braking. Additionally, implement method overloading in both classes by
//providing multiple versions of the accelerate() method, each accepting different parameters
//such as speed and duration. Finally, create a Main class to instantiate objects of both Car and
//Bicycle classes, test their overridden methods, and demonstrate method overloading by
//invoking different versions of the accelerate() method.package assignment01;

public interface Vehicle {
    void accelerate();
    void brake();
}
public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking.");
    }

    // Method overloading: accelerate with speed parameter
    public void accelerate(int speed) {
        System.out.println("The car is accelerating to " + speed + " km/h.");
    }

    // Method overloading: accelerate with speed and duration parameters
    public void accelerate(int speed, int duration) {
        System.out.println("The car is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}
public class Bicycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("The bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle is braking.");
    }

    // Method overloading: accelerate with speed parameter
    public void accelerate(int speed) {
        System.out.println("The bicycle is accelerating to " + speed + " km/h.");
    }

    // Method overloading: accelerate with speed and duration parameters
    public void accelerate(int speed, int duration) {
        System.out.println("The bicycle is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}

public class ass01q08
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        // Instantiate objects of Car and Bicycle
        Car car001 = new            Car();
        Bicycle bicycle001 = new    Bicycle();

        // Test overridden methods
        System.out.println("Car Actions:");
        car001.accelerate();
        car001.brake();
        System.out.println();

        System.out.println("Bicycle Actions:");
        bicycle001.accelerate();
        bicycle001.brake();
        System.out.println();

        // Demonstrate method overloading
        System.out.println("Car Overloaded Accelerate Methods:");
        car001.accelerate(8000000000); // Accelerate with speed
        car001.accelerate(1000000, 100000000); // Accelerate with speed and duration
        System.out.println();

        System.out.println("Bicycle Overloaded Accelerate Methods:");
        bicycle001.accelerate(200000); // Accelerate with speed
        bicycle001.accelerate(250000000, 50000000000); // Accelerate with speed and duration
    }
}

//Vehicle Interface:

//This interface defines two abstract methods: accelerate() and brake().
//Car Class:

//Implements the Vehicle interface and overrides the accelerate() and brake() methods to print messages indicating car-specific actions.
//Demonstrates method overloading by providing multiple versions of the accelerate() method with different parameters.
//Bicycle Class:

//Implements the Vehicle interface and overrides the accelerate() and brake() methods to print messages indicating bicycle-specific actions.
//Demonstrates method overloading by providing multiple versions of the accelerate() method with different parameters.
//Main Class:

//Instantiates objects of Car and Bicycle.
//Tests the overridden accelerate() and brake() methods for both classes.
//Demonstrates method overloading by invoking different versions of the accelerate() method for both the Car and Bicycle objects.
//This program demonstrates the use of interfaces to define common behavior, method overriding to provide specific implementations for different classes, and method overloading to offer different ways of performing the same action.







