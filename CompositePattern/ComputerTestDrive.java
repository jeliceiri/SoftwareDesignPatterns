import java.util.*;

/**
 * ComputerTestDrive 
 * @author Jill Eliceiri
 * April 5, 2019
 */

public class ComputerTestDrive {
    
    public static void main(String args[]) {
        
        //instance variables represets a composite
        ComputerComponent computer = 
                new ComputerComposite("Computer", "Computer Composite");
        ComputerComponent graphCard = 
                new ComputerComposite("Graph Card", "Graph Card Composite");
         
        //top level composite
        ComputerComponent allComputers = 
                new ComputerComposite ("Top Level Computer Architechture", "Everything combined");
        
        //add computer to top level 
        allComputers.add(computer);
        
        //add computer parts  
        computer.add(new ComputerPart(
            "Monitor", 
            "Display screen", 
            500.00));
        computer.add(new ComputerPart(
            "Keyboard", 
            "Device for user input", 
            100.00));
        computer.add(new ComputerPart(
            "CPU",
            "Executes stored instructions",
            500.00));
        computer.add(new ComputerPart(
            "Memory",
            "Information storage",
            300.00));
        
        //add graph  
        computer.add(graphCard);

        //add graph card parts
        graphCard.add(new ComputerPart(
            "GPU",
            "Process and display graphics", 
            300.00));
        graphCard.add(new ComputerPart(
            "Memory",
            "Information storage", 
            300.00));
        
        //hand all computer parts and composites to the client
        Client client = new Client(allComputers);
        
        //print everything
        client.printMenu();
    }
}
