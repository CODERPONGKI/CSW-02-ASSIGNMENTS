//Write a Java program illustrating garbage collection through an UnreachableObject class. This class
//will include a constructor initializing an object with a given name, a show() method creating an instance
//of UnreachableObject class and then invoking display(), a display() method creating an
//UnreachableObject instance, and a main() method calling show() followed by an explicit invocation of
//the garbage collector. Additionally, the program will override the finalize() method to print the object's
//name upon successful garbage collection.
public class ass04q01 {

String name;
public ass04q01(String name) {
this.name = name;
}
void display() {
System.out.println("Displaying object: " + name);
ass04q01 u = new ass04q01("New Object");
}
protected void finalize() throws Throwable {
System.out.println("Garbage collecting object: " + name);
}
}
public class GarbageCollection {
static void show(String name) {
	ass04q01  u = newass04q01 (name);
u.display();
}
public static void main(String[] args) {
show("Show Object");
ass04q01  u = null;
System.gc();
}
}

