//Develop a Java class containing private data members of integer and double types, along
//with methods for initializing, setting, and updating these data members. Create two objects of
//this class, each calling the necessary methods to set or update the data members. Utilize the
//Runtime class to calculate the total memory allocated and the memory occupied by the objects.
//Employ any technique to make objects unreachable, hence eligible for garbage collection.
//Finally, recheck the utilized and total memory using the Runtime class.
import java.lang.management.ManagementFactory;
import java.util.concurrent.ThreadLocalRandom;
class DataMembers {
private int intValue;
private double doubleValue;
public void initialize(int intVal, double doubleVal) {
intValue = intVal;
doubleValue = doubleVal;
}
public void setIntValue(int intVal) {
intValue = intVal;
}
public void setDoubleValue(double doubleVal) {
doubleValue = doubleVal;
}
public int getIntValue() {
return intValue;
}
public double getDoubleValue() {
return doubleValue;
}
}
public class ass04q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Runtime runtime = Runtime.getRuntime();
// Calculate the total memory allocated
long totalMem = runtime.totalMem();
// Create two objects of the DataMembers class
DataMembers obj1 = new DataMem();
DataMembers obj2 = new DataMem();
// Set or update the data members using methods
obj1.initialize(ThreadLocalRandom.current().nextInt(100),
ThreadLocalRandom.current().nextDouble());
obj2.initialize(ThreadLocalRandom.current().nextInt(100),
ThreadLocalRandom.current().nextDouble());
// Make the objects unreachable
obj1 = null;
obj2 = null;
// Run the garbage collector
runtime.gc();
// Calculate the memory occupied by the objects
long usedMem = runtime.totalMemory() - runtime.freeMemory();
System.out.println("Total memory allocated: " + totalMem+ " bytes");
System.out.println("Memory occupied by objects: " + usedMem + " bytes");
}
}
