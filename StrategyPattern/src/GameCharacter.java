package Spr2019.Strategy.JE;

/**
 * Strategy Pattern
 * @author Jill Eliceiri
 * GameCharacter Class
 * Feb 12, 2019
 */
public abstract class GameCharacter {
    
    //delegate guitarBehavior
    GuitarBehavior guitarBehavior;
    
    public abstract void display();
    
    //call the correct method for each type using polymorphism
    public void performPlayGuitar(){
        guitarBehavior.playGuitar();
        
    }
    //dynamically set the guitarBehavior
    public void setGuitarBehavior(GuitarBehavior gb){
        this.guitarBehavior = gb;
    }   
}
