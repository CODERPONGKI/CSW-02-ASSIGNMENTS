//You are given a string containing alpha-numeric characters. Design 
//a Java program that displays the numeric characters if it is preceded by a vowel and 
//consonant in the given string. If such numeric characters are not present in the given string, 
//display appropriate message. If the input string is null or empty, throw a NullPointerException 
//\with an appropriate error message.
//Ensure that the program handles any potential exceptions gracefully.

class Book {
    private int bookId;
    private String bookName;
    private double price;

    // Constructor
    public Book(int bookId, String bookName, double price) {
        this.bookId =      bookId;
        this.bookName =       bookName;
        this.price =      price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Book ID-:> " + bookId + ", Book Name-:> " + bookName + ", Price-:> " + price;
    }

    // Overloaded equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId;
    }
}
public class ass03q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Book book1 = new Book(101, "bridgeton", 29.99);
        Book book2 = new Book(102, "queen charolete", 35.50);

        if (book1.getPrice() > book2.getPrice()) {
            System.out.println(book001);
        } else {
            System.out.println(book002);
        }
    }
}
