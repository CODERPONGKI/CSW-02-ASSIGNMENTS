//Develop a Java program showcasing reference reassignment and garbage collection using
//the ReassigningReference class. This class features    a constructor initializing an object with a
//given name. In the main(    ) method, two instances of ReassigningReference are created. Then,
//the reference is reassigned. Subsequently, the garbage collector is explicitly invoked.
//Additionally, the program overrides the finalize() method to pr   int the name of the object upon
//successful garbage collection.
class ReassigningReference {
String name;
public ReassigningReference(String name) {
this.name = name;
}
protected void finalize()      throws Throwable {
System.out.println("Garbage         collecting object: " + name);
}
}
public class ass04q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
ReassigningReference r001 = new ReassigningReference("Object 00001");
ReassigningReference r002 = new ReassigningReference("Object 000002");
r001 = r002;
r--2 = null;
System.gc();
}
}
