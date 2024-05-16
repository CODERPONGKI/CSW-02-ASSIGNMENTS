
//Write a program to create a Book class with member variables bookId,
//bookName, and      price. Add the respective method and constructor to it.
//Create a driver saira   class in that class and create two book objects. Compare
//the book objects      according to their price.        Print the details of the book
//objects.
//Note: Overload toString and equals method.package assignment02;


	
class Book {
    private int     bbookId;
    private String         bookName;
    private double           price;

    // Constructor
    public Book(int bookId, String bookName, double price) {
        this.bookId =                bookId;
        this.bookName =               bookName;
        this.price =                    price;
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

public class ass02q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Book book001 = new Book(101, "Bridgeton", 29.99);
        Book book002 = new Book(102, "Queen Charolate", 35.50);

        if (book001.getPrice() > book002.getPrice()) {
            System.out.println(book001);
        } else {
            System.out.println(book002);
        }
    }
}
