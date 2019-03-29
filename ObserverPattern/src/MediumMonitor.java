package Spr2019.Observer.JE;
/**
 * CPSC 6119 Assignment 2
 * MediumMonitor class 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */
public class MediumMonitor implements Observer, DisplayMonitor {
    //instance variables
    private Boolean needsRepair;
    private String status;
    private int name;
    private Subject grassData1;
    private Subject grassData2;
    
    //constructor
    public MediumMonitor(Subject grassData1, Subject grassData2) {
        this.grassData1 = grassData1;
        grassData1.registerObserver(this);
        this.grassData2 = grassData2;
        grassData2.registerObserver(this);
    }
    /**
    * This method updates the subscribed monitor with the machine information
    *  @param needsRepair whether the machine needs repair
    *  @param status the status of the machine
    *  @param name the name of the machine
    */
    public void update(Boolean needsRepair, String status, int name) {
        this.status = status;
        this.name = name;
        this.needsRepair = needsRepair;
        display();
    }
    /**
     * This method checks whether the machine needs repair and displays
     * an appropriate message including the status of the machine.
     */
    public void display() {
        String message;
        if (needsRepair){
            message = "needs repair";
            System.out.println("The Medium Monitor reports that machine " + 
                name + " " + message + ", at this level: " + status);
        } else {
            message = "does not need repair";
            System.out.println("The Medium Monitor reports that machine " + 
                name + " " + message + ", " + status);
        }
    }
}
