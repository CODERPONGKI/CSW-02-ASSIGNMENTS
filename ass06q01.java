//Write a Java program that illustrates the difference between using string literals and the new keyword
//for creating String objects. Your program should demonstrate the memory usage implications and how
//string comparison behaves differently in each case.
public class ass06q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
String s0001 = "Hello";
String s0002 = "Hello";
String s0003 = new String("Hello");
String s0004 = new String("Hello");
System.out.println("s1==== == s2: " + (s0001 == s0002));
System.out.println("s1 ====== s3: " + (s0001 == s0003));
System.out.println("s3 ====== s4: " + (s0003 == s0004));
System.out.println("s1.equals(s3): " + s0001.equals(s0003));
System.out.println("s1.intern() == s3: " + (s0001.intern() == s0003));
}
}

