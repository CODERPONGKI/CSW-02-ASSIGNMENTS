//rite a Java code snippet that comprises a Car class and a CarTester class.
//The Car class should define private fields for make and model, along with a
//parameterized constructor and getter/setter methods for these attributes.
//In the CarTester class, instantiate two instances of the Car class: myCarl with a specified 
//make and model, and myCar2 with null values. After instantiation, the CarTester class 
//should retrieve and print the initial make and model of both cars. Then, it should set new values
//for myCar2 using setter methods and print the updated make and model.
package assignment01;

//Car.java 
public class Car {
 private String make;
 private String model;

 // Parameterized constructor formed 
 public Car(String make, String model) {
     this.make = make;
     this.model = model;
 }

 // Getter for make method
 public String getMake() {
     return make;
 }

 // Setter for make method
 public void setMake(String make) {
     this.make = make;
 }

 // Getter for model has to be made
 public String getModel() {
     return model;
 }

 // Setter for model has to be made
 public void setModel(String model) {
     this.model = model;
 }
}

//CarTester.java to be made
public class ass01q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     // Instantiate myCar1 with specified make and model
     Car myCar1 = new Car("Toyota", "Corolla");
     // Instantiate myCar2 with null values
     Car myCar2 = new Car(null, null);

     // Print initial make and model of both cars
     System.out.println("myCar1->Make: " + myCar1.getMake() + ", Model-:> " + myCar1.getModel());
     System.out.println("myCar2->Make: " + myCar2.getMake() + ", Model-:> " + myCar2.getModel());

     // Set new values for myCar2 class
     myCar2.setMake("Honda");
     myCar2.setModel("Civic");

     // Print updated make and model of myCar2 class
     System.out.println("myCar2 (updated) - Make: " + myCar2.getMake() + ", Model: " + myCar2.getModel());



	}

}
