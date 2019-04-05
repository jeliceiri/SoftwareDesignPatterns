package Spr2019.JE;

/**
 * Decorator Pattern
 * MyHome class
 * @author Jill Eliceiri
 * March 2019
 */

public abstract class MyHome {
    
    String description = "unknown home";
    
    public String getDescription(){
        
        return description;
        
    }

    public abstract int cost();  
    
    public abstract int area();
}