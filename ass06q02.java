//Write a Java program that demonstrates the immutability of the String class and how it implements the
//CharSequence interface. Your program should illustrate the behaviours that highlight String immutability
//and its usage as a CharSequence.
public class ass06q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
String s001 = "Hello";
String s002 = s001.toUpperCase();
System.out.println("s1: " + s001);
System.out.println("s2: " + s002);
s001 = s001 + " World!";
System.out.println("s1: " + s001);
System.out.println("s2: " + s002);
CharSequence cs = "Hello";
System.out.println("cs: " + cs);
System.out.println("cs.subSequence(0, 2): " + cs.subSequence(0, 2));
}
}

