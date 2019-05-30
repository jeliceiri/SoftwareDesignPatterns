import java.util.Iterator;

/**
 * Client Class 
 * @author Jill Eliceiri
 * April 5, 2019
 */
  
public class Client {

    ComputerComponent allComputers;

    public Client(ComputerComponent allComputers) {
        this.allComputers = allComputers;
    }

    public void printMenu() {
        allComputers.print();
    }
}
