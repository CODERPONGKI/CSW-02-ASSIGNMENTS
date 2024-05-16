//Implement a custom NullPointerException class named CustomNullPointerException 
//that mimics the behavior of the standard NullPointerException, but instead of using
//default error messages or null references, it takes a String message as its constructor argument. 
//Your task is to create this custom exception
//class and demonstrate its usage in a Java program.

class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    // Constructor
    public Car(String model, String color, int speed) {
        this.model =    model;
        this.color =    color;
        this.speed =     speed;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Overloaded compareTo method
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Model-:> " + model + ", Color-:> " + color + ", Speed-:> " + speed;
    }
}

public class ass03q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Car car1 = new Car("mustanggg", "Red", 180);
        Car car2 = new Car("audiii", "Blue", 200);

        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println("The car with greater speed is-:>");
        System.out.println(fasterCar);
    }
}

