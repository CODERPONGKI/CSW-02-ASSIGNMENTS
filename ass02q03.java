package assignment02;

public class ass02q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Car implements Comparable<Car> {
    private String modelsss;
    private String color;
    private int speed;

    // Constructor
    public Car(String modelsss, String color, int speed) {
        this.modelsss = modelsss;
        this.color = color;
        this.speed = speed;
    }

    // Getters
    public String getModel() {
        return modelsss;
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
        return "Model: " + modelsss + ", Color: " + color + ", Speed: " + speed;
    }
}

public class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("nano", "Red", 180);
        Car car2 = new Car("nisaan magneite4 ",Blue", 2000000);

        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println("The car with greater speed is:");
        System.out.println(fasterCar);
    }
}
