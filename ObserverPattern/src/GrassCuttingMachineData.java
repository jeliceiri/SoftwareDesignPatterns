package Spr2019.Observer.JE;
/**
 * CPSC 6119 Assignment 2
 * GrassCuttingMachineData class 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */
import java.util.*;

public class GrassCuttingMachineData implements Subject {

    //instance variables, including an ArrayList of observers
    private ArrayList observers;
    private static int count = 1;
    private int machineName = 1;
    private boolean needsRepair;
    private String status;

    //constructor
    public GrassCuttingMachineData() {
        //maintain a list of observers
        observers = new ArrayList();
        //name the object with a unique integer
        machineName = count++;
    }
    /**
    * This method adds an observer to the ArrayList
    * @param obs the observer to be added
    */
    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }
    /**
    * This method removes the observer from the ArrayList
    * @param obs the observer to be removed
    */
    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    /**
    * This method notifies an observer that an update has been made
    */
    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            //iterate over each observer and call the appropriate update method
            Observer observer = (Observer) observers.get(i);
            observer.update(needsRepair, status, machineName);
        }
    }
    /**
    * This method calls notifyObservers()
    */
    public void measurementsChanged() {
        notifyObservers();
    }
    /**
    * This method checks the incoming data and sets the status for the machine.
    * Then, it will set if repairs are not needed. Finally, it calls the 
    * measurementsChanged() method.
    * @param data the incoming data to check
    */
    public void setMeasurements(String data) {
        
        //default value
        needsRepair = true;
        
        if (data.equals("normal")) {
            status = "running normal";
            needsRepair = false;
        }
        if (data.equals("minor")) {
            status = "minor repairs";
        }
        if (data.equals("major")) {
            status = "major repairs";
        }
        if (data.equals("hardFix")) {
            status = "hard fix";
        }
        if (data.equals("totallyBroke")) {
            status = "totally broke";
        }
        measurementsChanged();
    }
    /**
    * Get the status of this machine
    * @return status 
    */
    public String getStatus() {
        return status;
    }
    /**
    * Get the machine name
    * @return machineName 
    */
    public int getMachineName() {
        return machineName;
    }
    /**
    * Get whether the machine needs repairs
    * @return needsRepair  
    */    
    public Boolean getNeedsRepair() {
        return needsRepair;
    }
}
