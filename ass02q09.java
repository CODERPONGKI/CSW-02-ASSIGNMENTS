
//Write a java code that comprises of a class Address, having member variable plot no, at
//, post and required parameterised constructor. 
//Create a Tree map having key as name of a person and 
//value as address. Insert requirepackage assignment02;


public class Address {
    private String plotNo;
    private String at;
    private String post;

    // Parameterized Constructor
    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    // Getter methods
    public String getPlotNo() {
        return plotNo;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }

    // Overridden toString method for displaying the Address
    @Override
    public String toString() {
        return "Address{" +
                "plotNo='" + plotNo + '\'' +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class ass02q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  // Create a TreeMap with key as String (name of a person) and value as Address
        TreeMap<String, Address> addressBook = new TreeMap<>();

        // Insert required key-value pairs into the TreeMap
        addressBook.put("sairaa", new Address("123", "apple Strait", "Londonee"));
        addressBook.put("swarna", new Address("456", "Fruit Strait", "Londonee"));
        addressBook.put("ashlesha", new Address("789", "cat Strait", "New Yorker"));

        // Use an iterator to display the TreeMap entries
        Iterator<Map.Entry<String, Address>> iterator = addressBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name-:> " + entry.getKey() + ", " + entry.getValue());
        }
    }
}

