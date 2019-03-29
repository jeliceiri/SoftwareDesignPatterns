package Spr2019.Observer.JE;

/**
 * AdvancedMonitor Class 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */

public class AdvancedMonitor implements Observer, DisplayMonitor {

    //instance variables
    private String status;
    private int name;
    private Boolean needsRepair;
    private Subject grassData1;
    private Subject grassData2;
    private Subject grassData3;
    private Subject grassData4;
    private Subject grassData5;

    //constructor
    public AdvancedMonitor(Subject grassData1, Subject grassData2, 
        Subject grassData3, Subject grassData4, Subject grassData5) {

        this.grassData1 = grassData1;
        grassData1.registerObserver(this);
        this.grassData2 = grassData2;
        grassData2.registerObserver(this);
        this.grassData3 = grassData3;
        grassData3.registerObserver(this);
        this.grassData4 = grassData4;
        grassData4.registerObserver(this);
        this.grassData5 = grassData5;
        grassData5.registerObserver(this);
    }
    /**
    * This method updates the subscribed monitor with the machine information
    *  @param needsRepair whether the machine needs repair
    *  @param status the status of the machine
    *  @param name the name of the machine
    */
    public void update(Boolean needsRepair, String status, int name) {
        this.name = name;
        this.status = status;
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
            System.out.println("The Advanced Monitor reports that machine " + 
                name + " " + message + ", at this level: " + status);
        } else {
            message = "does not need repair";
            System.out.println("The Advanced Monitor reports that machine " + 
                name + " " + message + ", " + status);
        }
    }
}