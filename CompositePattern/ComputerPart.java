import java.util.Iterator;
import java.util.ArrayList;

/**
 * ComputerPart 
 * @author Jill Eliceiri
 * April 5, 2019
 */

public class ComputerPart extends ComputerComponent {
    String name;
    String description;
    double price;

    public ComputerPart(String name, String description, double price) 
    { 
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("\n\tName: " + getName());
        System.out.println("\tPrice: " + getPrice());
        System.out.println("\tDescription: " + getDescription());
    }
}
