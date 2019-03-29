package Spr2019.Observer.JE;

/**
 * CPSC 6119 Assignment 2
 * Observer interface 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */

public interface Observer {
    //this method updates the observer with necessary information information
    public void update(Boolean needsRepair, String status, int machineName);
}
