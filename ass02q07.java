
//Create a generic class Pair<K,V> with private variables key and value. 
//The class Pair should define a parameterised constructor and getter and 
//setter methods for these attributes. After addition of objects, the main class 
//should retrieve and print the pair of key and value.

//Define the generic class Pair
class Pair<K, V> {
 private K key;
 private V value;

 // Parameterized constructor
 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 // Getter for key
 public K         getKey() {
     return key;
 }

 // Setter for key
 public void                setKey(K key) {
     this.key = key;
 }

 // Getter for value
 public V            getValue() {
     return value;
 }

 // Setter for value
 public void               setValue(V value) {
     this.value = value;
 }
}
package assignment02;

public class ass02q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
     // Create instances of Pair
     Pair<String, Integer> pair001 = new Pair<>("Age", 21);
     Pair<String, String> pair002 = new Pair<>("Name", "saira");

     // Retrieve and print the key-value pairs
     System.out.println("Pair 1-:> Key = " + pair001.getKey() + ", Value == " + pair001.getValue());
     System.out.println("Pair 2-:> Key = " + pair002.getKey() + ", Value == " + pair002.getValue());

     // Modify the value of pair1
     pair001.setValue(31);
     System.out.println("Updated Pair 1: Key = " + pair001.getKey() + ", Value = " + pair001.getValue());
 }
}

