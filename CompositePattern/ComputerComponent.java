import java.util.*;

/**
 * ComputerComponent 
 * Represents a Computer Composite and Computer Part
 * @author Jill Eliceiri
 * April 5, 2019
 */

public abstract class ComputerComponent {
   
    public void add(ComputerComponent computerComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(ComputerComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public ComputerComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public void print() {
            throw new UnsupportedOperationException();
    }
}
