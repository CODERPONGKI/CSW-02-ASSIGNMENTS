
//Write a program to create an Animal class with member variables name,
//color, types (pet/wild). Override the hashCode method to print the
//unique id for the object. Create the objects of the Animal class and
//print its hashcode.package assignment02;
class Animalzzzzzzz {
    private String name;
    private String color;
    private String type;

    // Constructor
    public Animalzzzzzzz(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    // Overridden hashCode method
    @Override
    public int       hashCode() {
        return name.hashCode() + color.hashCode() + type.hashCode();
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type;
    }
}

public class AnimalDriver {
    public static void main(String[] args) {
        Animalzzzzzzz animal001 = new Animalzzzzzzz("Lion", "Golden", "Wild");
        Animalzzzzzzz animal002 = new Animalzzzzzzz("Dog", "Black", "Pet");

        System.out.println("Animal 1-:> " + animal001 + ", HashCode-:> " + animal001.hashCode());
        System.out.println("Animal 2-:> " + animal002 + ", HashCode-:> " + animal002.hashCode());
    }
}

