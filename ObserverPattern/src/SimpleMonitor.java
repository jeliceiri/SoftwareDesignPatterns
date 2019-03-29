package Spr2019.Observer.JE;

/**
 * CPSC 6119 Assignment 2
 * SimpleMonitor class 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */
	
public class SimpleMonitor implements Observer, DisplayMonitor {

    //instance variables
    private String status;
    private Boolean needsRepair;
    private Subject grassData;
    private int name;

    //constructor with one parameter
    public SimpleMonitor(Subject grassData) {
        this.grassData = grassData;
        grassData.registerObserver(this);
    }
    /**
    * This method updates the subscribed monitor with the machine information
    *  @param needsRepair whether the machine needs repair
    *  @param status the status of the machine
    *  @param name the name of the machine
    */
    public void update(Boolean needsRepair, String status, int name) {
        this.name = name;
        this.needsRepair = needsRepair;
        display();
    }
    /**
     * This method checks whether the machine needs repair and displays
     * an appropriate message.
     */
    public void display() {
            String message;
            if (needsRepair){
                message = "needs repair";
            } else message = "does not need repair";
            System.out.println("The Simple Monitor reports that machine " + name + " " + message);
    }
}