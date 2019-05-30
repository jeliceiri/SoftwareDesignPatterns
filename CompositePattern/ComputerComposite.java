import java.util.Iterator;
import java.util.ArrayList;

/**
 * ComputerComposite 
 * @author Jill Eliceiri
 * April 5, 2019
 */

public class ComputerComposite extends ComputerComponent {
    //array list to keep track of list of computer components
    ArrayList computerComponents = new ArrayList();
    String name;
    String description;

    public ComputerComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(ComputerComponent computerComponent) {
        computerComponents.add(computerComponent);
    }

    public void remove(ComputerComponent computerComponent) {
        computerComponents.remove(computerComponent);
    }

    public ComputerComponent getChild(int i) {
        return (ComputerComponent)computerComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
 
    public void print() {
        System.out.print("\nName: " + getName());
        System.out.println("\nDescription: " + getDescription());
        System.out.println("--------------------------------");

        //iterate through all Computer Components
        Iterator iterator = computerComponents.iterator();
        while (iterator.hasNext()) {
            ComputerComponent computerComponent = 
                    (ComputerComponent)iterator.next();
            computerComponent.print();
        }
    }
}
