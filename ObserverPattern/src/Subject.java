package Spr2019.Observer.JE;

/**
 * CPSC 6119 Assignment 2
 * Subject interface 
 * @author Jill Eliceiri
 * Feb 22, 2019
 */

public interface Subject {
    //register an observer
    public void registerObserver(Observer o);
    //remove an observer
    public void removeObserver(Observer o);
    //notify an observer
    public void notifyObservers();
}
